import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("Inscrições 6#HACKATONAges(1-2).csv");
        Scanner data = new Scanner(file);
        int id, register;
        String name;
        String startTime="", completionTime="", email="", hasATeam="", teamName="";
        String teamLeader="", teamLeaderEmail="", teamLeaderCourse="";
        String participantName="", partcipantEmail="", participantCourse="";

        
        while (data.hasNextLine()) {
            String row = data.nextLine();
            String[] column = row.split(";");

            if(column[5].equalsIgnoreCase("Sim, estou cadastrando a equipe!")){
                Team team = new Team(teamName);
                for (int i = 9; i < 39; i=+4) {
                    team.add(Integer.parseInt(column[i]),column[i-2],Course.valueOf(column[i+1]));
                }
            }else if(column[5].equalsIgnoreCase("Sim, estou entrando em uma equipe que já existe.")){
                if(column[31].equalsIgnoreCase())
                team.add(Integer.parseInt(column[9]),column[7],Course.valueOf(column[10]));
            }else if(column[5].equalsIgnoreCase("Não, vou encontrar uma equipe na hora.")){
                team.add(Integer.parseInt(column[38]),column[36],Course.valueOf(column[39]));
            }
        }
    }
}