package com.pg.java;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
public class Assignment5 {
	 private static String FILE = "D:/temp/FirstPdf.pdf";
	public static void main(String[] args) {
		
		int[] userArray=new int[6];
		int maxNum=0;
		//Generate random numbers in array
		for(int i=0;i<userArray.length;i++) {
			int num=new Random().nextInt(100);
			userArray[i]=num;
		}
		//fing highest Number
		System.out.println(Arrays.toString(userArray));
		for(int i=0;i<userArray.length;i++) {
			if(userArray[i]>maxNum) {
				maxNum=userArray[i];
			}
		}
		System.out.println("Max Number is: "+maxNum);
		 try {
	            Document document = new Document();
	            PdfWriter.getInstance(document, new FileOutputStream(FILE));
	            document.open();
	            document.addTitle("My first PDF");
	            document.addSubject("Using iText");
	            document.addKeywords("Java, PDF, iText");
	            document.addAuthor("Lars Vogel");
	            document.addCreator("Lars Vogel");
	            Font font = FontFactory.getFont(FontFactory.COURIER, 16);
	            Chunk chunk = new Chunk("Hello World", font);
	            
	            document.add(chunk);
	            Paragraph para=new Paragraph("Hiii bro");
	            document.add(para);
	            document.add(new Paragraph( "Report generated by: Preetam, " + new Date()));
	            PdfPTable table = new PdfPTable(2);
	           // Table table=new Table(3);
	            // t.setBorderColor(BaseColor.GRAY);
	            // t.setPadding(4);
	            // t.setSpacing(4);
	            // t.setBorderWidth(1);
	            PdfPCell c1 = new PdfPCell(new Phrase("Table Header 1"));
	            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	            table.addCell(c1);

	            c1 = new PdfPCell(new Phrase("Table Header 2"));
	            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	            table.addCell(c1);

	            c1 = new PdfPCell(new Phrase("Table Header 3"));
	            c1.setHorizontalAlignment(Element.ALIGN_CENTER);
	            table.addCell(c1);
	            table.setHeaderRows(1);

	            table.addCell("1.0");
	            table.addCell("1.1");
	            table.addCell("1.2");

	            document.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}