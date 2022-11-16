package com.QAP3JavaQ1;

public class CollegeStudent extends Student{
        protected int year;
        protected String subject;
        public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int myYear, String mySubject) {
            super(name, age, gender, idNum, gpa);
            this.year = myYear;
            this.subject = mySubject;
        }
        public int getYear(){
            return year;
        }
        public String getSubject(){
            return subject;
        }
        public void setYear() {

            this.year = year;
        }
        public void setSubject()
        {
            this.subject = subject;
        }
        public String toString() {return super.toString() + ", Year: " + year + ", Subject: " + subject;}
}

