package com.example.android.reportcard;

public class ReportCard {

    /**
     * ReportCard Class
     * Udacity MultiScreen Apps Course
     * SeePeck
     */

    public class ReportCard {

        //Student's name
        private String mStudentName;

        //Grade Year
        private int mGradeYear;

        //Subject

        private int mHomeEconomics
        private int mCommunications
        private int mCalculus
        private int mChemistry
        private int mFinance
        private int mMarketing

        /**
         * Constructor that creates ReportCard object
         *
         * @param studentName Name of the Student
         * @param gradeYear Current grade year of the student
         * @param homeEconomics Home Ec Grade
         * @param communications Communications Grade
         * @param calculus Calculus Grade
         * @param chemistry Chemistry Grade
         * @param finance Finance Grade
         * @param marketing Marketing Grade
          */

        public ReportCard(String studentName, int gradeYear, int homeEconomics, int communications, int calculus, int chemistry, int finance, int marketing) {
            mStudentName = studentName;
            mGradeYear = gradeYear;
            mHomeEconomics = homeEconomics;
            mCommunications = communications;
            mCalculus = calculus;
            mChemistry = chemistry;
            mFinance = finance;
            mMarketing = marketing;
        }

        public String getStudentName() {
            //Get the Student's name. @return the current student's name
            return mStudentName;
        }

        public void setStudentName(String studentName) {
            //Sets the name
            mStudentName = studentName
        }

        public int getGradeYear() {
            //Get the grade year. @return the current grade year
            return mGradeYear;
        }

        public void setGradeYear(int gradeYear) {
            //Sets the name
            mGradeYear = gradeYear;
        }

        public int getHomeEconomics() {
            //Get the Home Ec Grade. @return the home ec grade
            return mHomeEconomics;
        }

        public void setHomeEconomics(int homeEconomics) {
            //Sets the Home Ec grade
            mHomeEconomics = homeEconomics;
        }

        public int getCommunications() {
            //Get the communications grade. @return the communications grade
            return mCommunications;
        }

        public void setCommunications(int communications) {
            //Sets the communications grade
            mCommunications = communications;
        }

        public int getCalculus() {
            //Get the Calculus grade. @return the calculus grade
            return mCalculus;
        }

        public void setCalculus(int calculus) {
            //Sets the Calculus name
            mCalculus = calculus;
        }

        public int getChemistry() {
            //Get the Chemistry grade. @return the chemistry grade
            return mChemistry;
        }

        public void setChemistry(int chemistry) {
            //Sets the grade for chemistry
            mChemistry = chemistry;
        }

        public int getFinance() {
            //Get the Finance grade. @return the current Finance grade
            return mFinance;
        }

        public void setFinance(int finance) {
            //Sets the finance grade
            mFinance = finance;
        }

        public int getMarketing() {
            //Get the current marketing grade. @return the current marketing grade
            return mMarketing;
        }

        public void setMarketing(int marketing) {
            //Sets the marketing grade
            mMarketing = marketing;
        }

        public String toString() {
            //Return the Report Card
            return "Student's Name: " + mStudentName + "\n" +
                    "Grade Year: " + mGradeYear + "\n" +
                    "Home Econimics: " + mHomeEconomics + "\n" +
                    "Communications: " + mCommunications + "\n" +
                    "Calculus: " + mCalculus + "\n" +
                    "Chemistry: " + mChemistry + "\n" +
                    "Finance: " + mFinance + "\n" +
                    "Marketing: " +mMarketing;
        }
    }
}
