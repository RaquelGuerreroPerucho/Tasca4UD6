public class Covid {
    public static String covid(DatosPaciente datosPaciente)
    {
        if (datosPaciente.bodyTemperature>= 38)
        {
            if(datosPaciente.difficultyBreathing
                || (datosPaciente.diabetes)
                || (datosPaciente.cancer)
                || (datosPaciente.isPregnant)
                || (datosPaciente.isOver60yearsold)
                || (datosPaciente.hepatic)
                || (datosPaciente.respiratoryDisease)
                || (datosPaciente.kidnevDisease))
            {
                return "/diagnostico/"+datosPaciente.provincia;
            }
            else
            {
                return "/cuarentena/";
            }
        }
        else {return "/diagnostico_bueno/";}
    }
}