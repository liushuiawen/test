
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryFundoutInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryFundoutInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://facade.fos.netfinworks.com}fundoutQueryRequest" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://facade.fos.netfinworks.com}operationEnvironment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryFundoutInfo", propOrder = {
    "arg0",
    "arg1"
})
public class QueryFundoutInfo {

    protected FundoutQueryRequest arg0;
    protected OperationEnvironment arg1;

    /**
     * 获取arg0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FundoutQueryRequest }
     *     
     */
    public FundoutQueryRequest getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FundoutQueryRequest }
     *     
     */
    public void setArg0(FundoutQueryRequest value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationEnvironment }
     *     
     */
    public OperationEnvironment getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationEnvironment }
     *     
     */
    public void setArg1(OperationEnvironment value) {
        this.arg1 = value;
    }

}
