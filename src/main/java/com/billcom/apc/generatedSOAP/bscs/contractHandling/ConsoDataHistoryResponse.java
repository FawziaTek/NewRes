/**
 * ConsoDataHistoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.billcom.apc.generatedSOAP.bscs.contractHandling;

public class ConsoDataHistoryResponse  extends com.billcom.apc.generatedSOAP.bscs.contractHandling.OperationResponse  implements java.io.Serializable {
    private com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails[] consoDataHistory;

    public ConsoDataHistoryResponse() {
    }

    public ConsoDataHistoryResponse(
           java.lang.String bscsErrorCode,
           java.lang.String comment,
           java.lang.Boolean isSuccessful,
           com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails[] consoDataHistory) {
        super(
            bscsErrorCode,
            comment,
            isSuccessful);
        this.consoDataHistory = consoDataHistory;
    }


    /**
     * Gets the consoDataHistory value for this ConsoDataHistoryResponse.
     * 
     * @return consoDataHistory
     */
    public com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails[] getConsoDataHistory() {
        return consoDataHistory;
    }


    /**
     * Sets the consoDataHistory value for this ConsoDataHistoryResponse.
     * 
     * @param consoDataHistory
     */
    public void setConsoDataHistory(com.billcom.apc.generatedSOAP.bscs.contractHandling.ConsoDataDetails[] consoDataHistory) {
        this.consoDataHistory = consoDataHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsoDataHistoryResponse)) return false;
        ConsoDataHistoryResponse other = (ConsoDataHistoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.consoDataHistory==null && other.getConsoDataHistory()==null) || 
             (this.consoDataHistory!=null &&
              java.util.Arrays.equals(this.consoDataHistory, other.getConsoDataHistory())));
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
        if (getConsoDataHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsoDataHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsoDataHistory(), i);
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
        new org.apache.axis.description.TypeDesc(ConsoDataHistoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataHistoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoDataHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "consoDataHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://alu.services.ws.lhs.com", "ConsoDataDetails"));
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
