package com.orange.pageFactory;

import org.openqa.selenium.support.PageFactory;

public class OrgAdminPF extends OrgLoginPF {
	
	public OrgAdminPF() {
		PageFactory.initElements(driver,this );
		
	}
	

}
