
package com.netfinworks.fos.facade;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="needDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needQeryTotal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="needQueryAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalItem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryBase", propOrder = {
    "currentPage",
    "endRow",
    "needDelete",
    "needQeryTotal",
    "needQueryAll",
    "pageSize",
    "startRow",
    "totalItem"
})
@XmlSeeAlso({
    PaginatedQueryResponse.class,
    PaginatedQueryRequest.class
})
public class QueryBase {

    protected Integer currentPage;
    protected int endRow;
    protected boolean needDelete;
    protected boolean needQeryTotal;
    protected boolean needQueryAll;
    protected Integer pageSize;
    protected int startRow;
    protected Integer totalItem;

    /**
     * 获取currentPage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 设置currentPage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPage(Integer value) {
        this.currentPage = value;
    }

    /**
     * 获取endRow属性的值。
     * 
     */
    public int getEndRow() {
        return endRow;
    }

    /**
     * 设置endRow属性的值。
     * 
     */
    public void setEndRow(int value) {
        this.endRow = value;
    }

    /**
     * 获取needDelete属性的值。
     * 
     */
    public boolean isNeedDelete() {
        return needDelete;
    }

    /**
     * 设置needDelete属性的值。
     * 
     */
    public void setNeedDelete(boolean value) {
        this.needDelete = value;
    }

    /**
     * 获取needQeryTotal属性的值。
     * 
     */
    public boolean isNeedQeryTotal() {
        return needQeryTotal;
    }

    /**
     * 设置needQeryTotal属性的值。
     * 
     */
    public void setNeedQeryTotal(boolean value) {
        this.needQeryTotal = value;
    }

    /**
     * 获取needQueryAll属性的值。
     * 
     */
    public boolean isNeedQueryAll() {
        return needQueryAll;
    }

    /**
     * 设置needQueryAll属性的值。
     * 
     */
    public void setNeedQueryAll(boolean value) {
        this.needQueryAll = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * 获取startRow属性的值。
     * 
     */
    public int getStartRow() {
        return startRow;
    }

    /**
     * 设置startRow属性的值。
     * 
     */
    public void setStartRow(int value) {
        this.startRow = value;
    }

    /**
     * 获取totalItem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalItem() {
        return totalItem;
    }

    /**
     * 设置totalItem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalItem(Integer value) {
        this.totalItem = value;
    }

}
