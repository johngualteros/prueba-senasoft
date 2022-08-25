package sena.sena.util;

import java.awt.Color;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import sena.sena.Models.Cliente;

@Component("views/clientes/listar")
public class listReporte extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Cliente> listacliente = (List<Cliente>) model.get("clientes");
        PdfPTable tabletitulo = new PdfPTable(1);
        PdfPCell celda = null;
        Font fuenteTitulo = FontFactory.getFont("sans-serif",16);
        celda = new PdfPCell(new Phrase("LISTA DE CLIENTES ",fuenteTitulo));
        celda.setBorder(0);
        celda.setBackgroundColor(new Color(113, 204, 236));
        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
        celda.setVerticalAlignment(Element.ALIGN_CENTER);
        celda.setPadding(20);

        tabletitulo.addCell(celda);
        tabletitulo.setSpacingAfter(30);

        PdfPTable tablecliente = new PdfPTable(5);
        listacliente.forEach(cliente -> {
            tablecliente.addCell(cliente.getIdcliente().toString());
            tablecliente.addCell(cliente.getCedulacliente());
            tablecliente.addCell(cliente.getNombre());
            tablecliente.addCell(cliente.getTelefono());
            tablecliente.addCell(cliente.getEstado().toString());


        });
        document.add(tabletitulo);
        document.add(tablecliente);
    }
    
}
