package entidades;

import java.util.List;

public class Spinning extends Sala{
    public Spinning() {
        super();
    }

    public Spinning(Gym gym) {
        super();
        this.gym = gym;
    }

    @Override
    public List<Aluno> getAlunosList() {
        return alunosList;
    }

    @Override
    public List<Aluno> getHorariosQuartaList() {
        return horariosQuartaList;
    }

    @Override
    public List<Aluno> getHorariosSextaList() {
        return horariosSextaList;
    }

    @Override
    public List<Aluno> getHorariosSabadoList() {
        return horariosSabadoList;
    }

    @Override
    public List<Aluno> getHorariosQuartaManhaList() {
        return horariosQuartaManhaList;
    }

    @Override
    public List<Aluno> getHorariosQuartaTardeList() {
        return horariosQuartaTardeList;
    }

    @Override
    public List<Aluno> getHorariosQuartaNoiteList() {
        return horariosQuartaNoiteList;
    }

    @Override
    public List<Aluno> getHorariosSextaManhaList() {
        return horariosSextaManhaList;
    }

    @Override
    public List<Aluno> getHorariosSextaTardeList() {
        return horariosSextaTardeList;
    }

    @Override
    public List<Aluno> getHorariosSextaNoiteList() {
        return horariosSextaNoiteList;
    }

    @Override
    public List<Aluno> getHorariosSabadoManhaList() {
        return horariosSabadoManhaList;
    }

    @Override
    public List<Aluno> getHorariosSabadoTardeList() {
        return horariosSabadoTardeList;
    }

    @Override
    public List<Aluno> getHorariosSabadoNoiteList() {
        return horariosSabadoNoiteList;
    }

    @Override
    public void addAluno(Aluno aluno) {
        alunosList.add(aluno);
    }

    @Override
    public void addHorarioQuarta(Aluno aluno) {
        horariosQuartaList.add(aluno);
    }

    @Override
    public void addHorarioSexta(Aluno aluno) {
        horariosSextaList.add(aluno);
    }

    @Override
    public void addHorarioSabado(Aluno aluno) {
        horariosSabadoList.add(aluno);
    }

    @Override
    public void addHorarioQuartaManha(Aluno aluno){
        horariosQuartaManhaList.add(aluno);
    }
    @Override
    public void addHorarioQuartaTarde(Aluno aluno){
        horariosQuartaTardeList.add(aluno);
    }
    @Override
    public void addHorarioQuartaNoite(Aluno aluno){
        horariosQuartaNoiteList.add(aluno);
    }
    @Override
    public void addHorarioSextaManha(Aluno aluno){
        horariosSextaManhaList.add(aluno);
    }
    @Override
    public void addHorarioSextaTarde(Aluno aluno){
        horariosSextaTardeList.add(aluno);
    }
    @Override
    public void addHorarioSextaNoite(Aluno aluno){
        horariosSextaNoiteList.add(aluno);
    }
    @Override
    public void addHorarioSabadoManha(Aluno aluno){
        horariosSabadoManhaList.add(aluno);
    }
    @Override
    public void addHorarioSabadoTarde(Aluno aluno){
        horariosSabadoTardeList.add(aluno);
    }
    @Override
    public void addHorarioSabadoNoite(Aluno aluno){
        horariosSabadoNoiteList.add(aluno);
    }
}
