package com.autowiredependson;


    public class City {
        private int id;
        private String name;
        private State s;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public State getS() {
            return s;
        }
        public void setS(State s) {
            this.s = s;
        }
        
    
        public void showCityDetails()
        {
            System.out.println("city id:"+id);
            System.out.println("city name:"+name);
            System.out.println("state:"+s.getName());
        }
        
    }

