package com.icicilombard.marine;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "calcMarinePremium")
@XmlAccessorType(XmlAccessType.FIELD)
public class CalcMarinePremium {
	@XmlElement(name = "arg0")
	public String arg0;

	public String getArg0() {
		return arg0;
	}

	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}
}
