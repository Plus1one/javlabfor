public class Subdivision{
    int id;
    String name;

    /**
     * Конструктор
     * @param idd айди
     * @param namee имя подразделения
     */
    public Subdivision(int idd, String namee)
    {
        id= idd;
        name = namee;
    }

    /**
     * Геттер айди
     * @return айди
     */
    public int sdGetId()
    {
        return id;
    }
    /**
     * Геттер названия подразделения
     * @return имя
     */
    public String sdGetName()
    {
        return name;
    }
}
