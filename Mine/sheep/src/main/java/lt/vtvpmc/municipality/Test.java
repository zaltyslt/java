package lt.vtvpmc.municipality;

public class Test extends AbstractMunicipalityTest{
    @Override
    public Municipality getMunicipality() {
        return new MyMunicipality();
    }
}
