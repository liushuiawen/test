
package com.netfinworks.fos.facade;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>fundoutQueryResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="fundoutQueryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://facade.fos.netfinworks.com}paginatedQueryResponse">
 *       &lt;sequence>
 *         &lt;element name="fundoutInfoList" type="{http://facade.fos.netfinworks.com}fundoutInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundoutQueryResponse", propOrder = {
    "fundoutInfoList"
})
public class FundoutQueryResponse
    extends PaginatedQueryResponse
{

    @XmlElement(nillable = true)
    protected List<FundoutInfo> fundoutInfoList;

    /**
     * Gets the value of the fundoutInfoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundoutInfoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundoutInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundoutInfo }
     * 
     * 
     */
    public List<FundoutInfo> getFundoutInfoList() {
        if (fundoutInfoList == null) {
            fundoutInfoList = new ArrayList<FundoutInfo>();
        }
        return this.fundoutInfoList;
    }

}
