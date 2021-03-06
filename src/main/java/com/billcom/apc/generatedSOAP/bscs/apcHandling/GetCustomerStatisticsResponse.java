/**
 * GetCustomerStatisticsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.apcHandling;

public class GetCustomerStatisticsResponse  extends com.billcom.apc.generatedSOAP.bscs.apcHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean[] beans;

    public GetCustomerStatisticsResponse() {
    }

    public GetCustomerStatisticsResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean[] beans) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.beans = beans;
    }


    /**
     * Gets the beans value for this GetCustomerStatisticsResponse.
     * 
     * @return beans
     */
    public com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean[] getBeans() {
        return beans;
    }


    /**
     * Sets the beans value for this GetCustomerStatisticsResponse.
     * 
     * @param beans
     */
    public void setBeans(com.billcom.apc.generatedSOAP.bscs.apcHandling.GetCustomerStatisticsBean[] beans) {
        this.beans = beans;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCustomerStatisticsResponse)) return false;
        GetCustomerStatisticsResponse other = (GetCustomerStatisticsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.beans==null && other.getBeans()==null) || 
             (this.beans!=null &&
              java.util.Arrays.equals(this.beans, other.getBeans())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBeans() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBeans());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBeans(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCustomerStatisticsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "beans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "GetCustomerStatisticsBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
