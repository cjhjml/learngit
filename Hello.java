package com.jike.po.audit.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdapterCDATA extends XmlAdapter<String, String> {

  @Override
  public String unmarshal(String v) throws Exception {
    return v;
  }

  @Override
  public String marshal(String v) throws Exception {
    return "<![CDATA[" + v + "]]>";
  }
}
HEAD
