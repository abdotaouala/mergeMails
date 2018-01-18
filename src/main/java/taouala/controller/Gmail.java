package taouala.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import taouala.model.Mail;

public class Gmail implements SendMailController {



	public boolean prepareMail(Mail mail) throws Exception{
		FileInputStream fis=new FileInputStream(new File("C://Users//abdou//Desktop//Classeur1.xls"));
		//create workbook instance that refers to .xls file
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		
		//create a sheet object to retreve the sheet
		HSSFSheet sheet =wb.getSheetAt(0);
		
		//that is for evaluate the cell type
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
		for(Row row:sheet){
			for(Cell cell : row){
				switch(formulaEvaluator.evaluateInCell(cell).getCellType()){
				//if cell is a numeric format
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
					//if cell is a string format
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue());
					SendMail sendMail=new SendMail();
					sendMail.SendEmail( cell.getStringCellValue(), mail.getEmailSubject(),
							 mail.getEmailBody());
					break;
				}
			}
			System.out.println();
		}
		return false;
	}
	  public class SMTPAuthenticator extends javax.mail.Authenticator
	  {
	  public PasswordAuthentication getPasswordAuthentication()
	  {
	  return new PasswordAuthentication("abdotaouala@gmail.com", "tpw123tpwtpw");
	  }
	  }
}
