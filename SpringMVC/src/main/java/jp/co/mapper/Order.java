package jp.co.mapper;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "ID", "NAME"})
public class Order {
	private int ID;
	private String NAME;

	public void setId(int id){
		this.ID = id;
	}

	public void setName(String name){
		this.NAME = name;
	}

	public int getId(){
		return ID;
	}

	//getString → ×
	//getName   → ○   意味が分からん
	public String getName(){
		return NAME;
	}

}
