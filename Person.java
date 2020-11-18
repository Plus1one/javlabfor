public class Person {
    String id;
    String name;
    String sex;
    String date;
    Subdivision sd;
    String ZP;

/////////////////

    /**
     * Конструктор
     * @param idd айди
     * @param namee имя
     * @param sexx пол
     * @param datee дата
     * @param sdd объект - подразделение
     * @param zpp зарплата
     */
    public Person(String idd, String namee, String sexx, String datee, Subdivision sdd, String zpp)
    {
        id = idd;
        name=namee;
        sex=sexx;
        date=datee;
        sd=sdd;
        ZP=zpp;
    }


    /**
     * сеттер айди
     * @param idd айди 
     */
    public void setId(String idd)
    {
        id = idd;
    }

    /**
     * геттер
     * @return id
     */
    public String getId()
    {
        return id;
    }
    ////////////////
    /**
     * геттер имени
     * @param namee имя
     */
    public void setName(String namee)
    {
        name = namee;
    }
    /**
     * геттер
     * @return id
     */
    public String getName()
    {
        return name;
    }
    /////////////
    /**
     * сеттер пола
     * @param sexx пол
     */
    public void setSex(String sexx)
    {
        sex = sexx;
    }
    /**
     * геттер пола
     * @return id
     */
    public String getSex()
    {
        return sex;
    }
    //////////////
    /**
     * сеттер подразделения
     * @param sdd подразделение
     */
    public void setName(Subdivision sdd)
    {
        sd = sdd;
    }
    /**
     * геттер подразделения
     * @return id
     */
    public Subdivision getSd()
    {
        return sd;
    }
    //////////////
    /**
     * сеттер зп
     * @param ZPP зп
     */
    public void setZP(String ZPP)
    {
        ZP = ZPP;
    }
    /**
     * геттер зп
     * @return id
     */
    public String getZP()
    {
        return ZP;
    }
    //////////////
    /**
     * сеттер даты
     * @param datee дата
     */
    public void setDate(String datee)
    {
        date = datee;
    }
    /**
     * геттер даты
     * @return date
     */
    public String getDate()
    {
        return date;
    }

    //public void displayinfo(Person obj)
    //{
    //    System.out.println(getId()+ " ");
    //    System.out.println(getName()+ " ");
    //    System.out.println(getSex()+ " ");
    //    System.out.println(getDate()+ " ");
    //    System.out.println(getSd()+ " ");
    //    System.out.println(getZP());
    //}
}

