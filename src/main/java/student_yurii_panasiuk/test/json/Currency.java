package student_yurii_panasiuk.test.json;

import java.math.BigDecimal;

class Currency {

         int id;
        int Code;
        String Ccy;
        String CcyNm_RU;
        String	CcyNm_UZ;
        String CcyNm_UZC;
        String CcyNm_EN;
        int Nominal;
        BigDecimal Rate;
        BigDecimal Diff;
        String Date;

        public int getId() {
            return id;
        }

        public int getCode() {
            return Code;
        }

        public String getCcy() {
            return Ccy;
        }

        public String getCcyNm_RU() {
            return CcyNm_RU;
        }

        public String getCcyNm_UZ() {
            return CcyNm_UZ;
        }

        public String getCcyNm_UZC() {
            return CcyNm_UZC;
        }

        public String getCcyNm_EN() {
            return CcyNm_EN;
        }

        public int getNominal() {
            return Nominal;
        }

        public BigDecimal getRate() {
            return Rate;
        }

        public BigDecimal getDiff() {
            return Diff;
        }

        public String getDate() {
            return Date;

    }

}
