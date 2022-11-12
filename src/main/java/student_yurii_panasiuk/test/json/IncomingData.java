package student_yurii_panasiuk.test.json;

class IncomingData {
    String urlJson;
    String workFolderAndFileName;

    IncomingData(String urlJson, String workFolderAndFileName) {
        this.urlJson = urlJson;
        this.workFolderAndFileName = workFolderAndFileName;
    }

     void setUrlJson(String urlJson) {
        this.urlJson = urlJson;
    }

     void setWorkFolderAndFileName(String workFolderAndFileName) {
        this.workFolderAndFileName = workFolderAndFileName;
    }

    String getUrlJson() {
        return urlJson;
    }

     String getWorkFolderAndFileName() {
        return workFolderAndFileName;
    }

}
