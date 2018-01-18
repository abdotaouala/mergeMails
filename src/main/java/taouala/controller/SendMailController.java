package taouala.controller;

import java.io.File;

import org.apache.poi.ss.usermodel.FormulaEvaluator;

import taouala.model.Mail;

public interface SendMailController {
	public boolean prepareMail(Mail mail) throws Exception;
}
