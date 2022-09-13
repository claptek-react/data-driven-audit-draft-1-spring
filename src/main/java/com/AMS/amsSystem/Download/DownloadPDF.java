package com.AMS.amsSystem.Download;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;


import com.AMS.amsSystem.Model.ProcessData;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class DownloadPDF {
	
	private List<ProcessData> processData;

	
	public void generate(HttpServletResponse response) throws DocumentException, IOException {

		
		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		
		document.open();
		
		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		
		fontTiltle.setSize(20);
		
		Paragraph paragraph = new Paragraph("Process Data Report", fontTiltle);
		
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);
		
		document.add(paragraph);
		
		PdfPTable table = new PdfPTable(3);
		
		table.setWidthPercentage(100f);
		table.setWidths(new int[] { 3, 3, 3 });
		table.setSpacingBefore(5);

		PdfPCell cell = new PdfPCell();
		
		cell.setBackgroundColor(CMYKColor.MAGENTA);
		cell.setPadding(5);

		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		font.setColor(CMYKColor.WHITE);
		
		cell.setPhrase(new Phrase("ID", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Object Title", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Valid From", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Valid Until", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Owner Organisation", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Owner", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Level 1 Approver", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Level 2 Approver", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Relationships", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Status", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Categoryr", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Business Criticality", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Created On", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Created By", font));
		table.addCell(cell);

		
		for (ProcessData process : processData) {
			table.addCell(String.valueOf(process.getObjId()));
			table.addCell(process.getObjTitle());
			table.addCell(process.getValidFrom());
			table.addCell(process.getValidUntil());
			table.addCell(process.getOwnerOrganisation());
			table.addCell(process.getOwner());
			table.addCell(process.getLevel1Approver());
			table.addCell(process.getLevel2Approver());
			table.addCell(process.getRelationships());
			table.addCell(process.getStatus());
			table.addCell(process.getCategory());
			table.addCell(process.getBuisnessCriticality());
			table.addCell(process.getCreatedOn());
			table.addCell(process.getCreatedBy());
			
		}

		
		document.add(table);
		document.close();

}


	

	


}