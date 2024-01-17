public class Person {
    
    public class Date {
        private int day;
        private String month;
        private Integer year;

        Date(){}

        Date(int day, String month, Integer year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        /**
         * sets day instance to parameter
         * @param dayInput
         */
        public void setDay(int dayInput){
            this.day = dayInput;
        }
        
        /**
         * @return day instance
         */
        public int getDay(){
            return this.day;
        }

        /**
         * sets month instance to parameter
         * @param monthInput
         */
        public void setMonth(String monthInput){
            this.month = monthInput;
        }

         /**
         * @return month instance
         */
        public String getMonth(){
            return this.month;
        }

         /**
         * sets year instance to parameter
         * @param monthInput
         */
        public void setYear(int yearInput) {
           this.year = yearInput;
        }

        /**
         * @return year instance
         */
        public Integer getYear(){
            return this.year;
        }
        /**
         * @param obj
         * @return true false based on equality 
         */
        public boolean comesBefore(Date obj){
            return this.getYear() < obj.getYear();
        }

        @Override
        public String toString() {
            return "" + getDay() + " " + getMonth() + " " + getYear();
        }


    }

    private String name;
    private Date born;
    private Date died;

    Person(){}

    Person(String name, Date birth, Date death){
        this.name = name;
        try {
            if (birth.getYear() < death.getYear() || death == null ){
                this.born = birth;
                this.died = death;
            }
            else {
                throw new Exception("death cannot come before birth date");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    /**
     * @param nameInput sets name instance to parameter
     */
    public void setName(String nameInput){
        this.name = nameInput;
    }

    /**
     * @return name instance
     */
    public String getName(){
        return this.name;
    }

    /**
     * @param day
     * @param month
     * @param year
     * @return new Date object
     */
    public void setBirth(int day, String month, int year){
        born = new Date(day, month, year);
    }

    /**
     * @return born object
     */
    public Date getBirth(){
        return this.born;
    }

    /**
     * sets death instance to Date object
     * @param day
     * @param month
     * @param year
     * @return
     */
    public void setDeath(int day, String month, int year){
        died =  new Date(day, month, year);
    }

    /**
     * @return died instance
     */
    public Date getDeath(){
        return this.died;
    }

    @Override
    public String toString() {
        String result = name;
        if (born != null) {
            result += ", born " + born;
        }
        if (died != null) {
            result += ", died " + died;
        }
        return result;
    }

}
