
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fundoutGetResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fundoutGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://facade.fos.netfinworks.com}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="fundoutInfo" type="{http://facade.fos.netfinworks.com}fundoutInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundoutGetResponse", propOrder = {
    "fundoutInfo"
})
public class FundoutGetResponse
    extends BaseResponse
{

    protected FundoutInfo fundoutInfo;

    /**
     * 获取fundoutInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FundoutInfo }
     *     
     */
    public FundoutInfo getFundoutInfo() {
        return fundoutInfo;
    }

    /**
     * 设置fundoutInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FundoutInfo }
     *     
     */
    public void setFundoutInfo(FundoutInfo value) {
        this.fundoutInfo = value;
    }

}
