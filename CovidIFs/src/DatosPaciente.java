public class DatosPaciente {
    float bodyTemperature;
    boolean difficultyBreathing,diabetes,cancer,isPregnant,isOver60yearsold,hepatic, kidnevDisease,respiratoryDisease;
    String provincia;

    public DatosPaciente(float bodyTemperature, boolean difficultyBreathing, boolean diabetes, boolean cancer, boolean isPregnant, boolean isOver60yearsold, boolean hepatic, boolean kidnevDisease, boolean respiratoryDisease, String provincia) {
        this.bodyTemperature = bodyTemperature;
        this.difficultyBreathing = difficultyBreathing;
        this.diabetes = diabetes;
        this.cancer = cancer;
        this.isPregnant = isPregnant;
        this.isOver60yearsold = isOver60yearsold;
        this.hepatic = hepatic;
        this.kidnevDisease = kidnevDisease;
        this.respiratoryDisease = respiratoryDisease;
        this.provincia = provincia;
    }
}
