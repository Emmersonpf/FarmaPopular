package br.com.genius.farmapopular;

import java.util.List;

/**
 * Created by Desenvolvimento on 24/05/2017.
 */

public class jsonMedicamentos {

    private String id;
    private String document_id;
    private String remote_id;
    private String file_name;
    private String media_link;
    private int page_count;
    private String uploaded_at;
    private String processed_at;
    private List<TableDataBean> table_data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public String getRemote_id() {
        return remote_id;
    }

    public void setRemote_id(String remote_id) {
        this.remote_id = remote_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getMedia_link() {
        return media_link;
    }

    public void setMedia_link(String media_link) {
        this.media_link = media_link;
    }

    public int getPage_count() {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }

    public String getUploaded_at() {
        return uploaded_at;
    }

    public void setUploaded_at(String uploaded_at) {
        this.uploaded_at = uploaded_at;
    }

    public String getProcessed_at() {
        return processed_at;
    }

    public void setProcessed_at(String processed_at) {
        this.processed_at = processed_at;
    }

    public List<TableDataBean> getTable_data() {
        return table_data;
    }

    public void setTable_data(List<TableDataBean> table_data) {
        this.table_data = table_data;
    }

    public static class TableDataBean {
        /**
         * key_0 : ITEM
         * key_1 : INDICAÇÃO
         * key_2 : FÁRMACO
         * key_3 : MEDICAMENTO
         * key_4 : LABORATÓRIO
         * key_5 : APRESENTAÇÃO
         * key_6 : QTDE
         */

        private String key_0;
        private String key_1;
        private String key_2;
        private String key_3;
        private String key_4;
        private String key_5;
        private String key_6;

        public String getKey_0() {
            return key_0;
        }

        public void setKey_0(String key_0) {
            this.key_0 = key_0;
        }

        public String getKey_1() {
            return key_1;
        }

        public void setKey_1(String key_1) {
            this.key_1 = key_1;
        }

        public String getKey_2() {
            return key_2;
        }

        public void setKey_2(String key_2) {
            this.key_2 = key_2;
        }

        public String getKey_3() {
            return key_3;
        }

        public void setKey_3(String key_3) {
            this.key_3 = key_3;
        }

        public String getKey_4() {
            return key_4;
        }

        public void setKey_4(String key_4) {
            this.key_4 = key_4;
        }

        public String getKey_5() {
            return key_5;
        }

        public void setKey_5(String key_5) {
            this.key_5 = key_5;
        }

        public String getKey_6() {
            return key_6;
        }

        public void setKey_6(String key_6) {
            this.key_6 = key_6;
        }
    }
}
