package br.com.genius.farmapopular;

import java.util.List;

/**
 * Created by Desenvolvimento on 17/05/2017.
 */

public class jsonFormat {


    private List<List<String>> resultset;
    private List<MetadataBean> metadata;

    public List<List<String>> getResultset() {
        return resultset;
    }

    public void setResultset(List<List<String>> resultset) {
        this.resultset = resultset;
    }

    public List<MetadataBean> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataBean> metadata) {
        this.metadata = metadata;
    }


    public static class MetadataBean {
        /**
         * colIndex : 0
         * colType : Numeric
         * colName : Código do IBGE
         */

        private int colIndex;
        private String colType;
        private String colName;

        public int getColIndex() {
            return colIndex;
        }

        public void setColIndex(int colIndex) {
            this.colIndex = colIndex;
        }

        public String getColType() {
            return colType;
        }

        public void setColType(String colType) {
            this.colType = colType;
        }

        public String getColName() {
            return colName;
        }

        public void setColName(String colName) {
            this.colName = colName;
        }
    }
}

