import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jobs> Jobs = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("==digijobs===");
            System.out.println("please choose : ");
            System.out.println("1. add new job");
            System.out.println("2. print all job");
            System.out.println("3. delete job");
            System.out.println("4. exit");
            String input = myObj.nextLine();
            String jobId;
            if (input.equals("1")) {
                System.out.println("Masukan data sesuai format berikut : [job_id], [job_address], [job_position_id], [job_position_name]");
                String inputJob = myObj.nextLine();
                String[] pisah = inputJob.split(",");
                if (pisah.length == 4) {
                    Jobs newJob = new Jobs();
                    newJob.setJobId(pisah[0]);
                    newJob.setJobAddress(pisah[1]);
                    newJob.setIdJobPosition(pisah[2]);
                    newJob.setJobPosition(pisah[2]);
                    Jobs.add(newJob);
                    System.out.println("Sukses");
                    continue;
                }
                System.out.println("format salah");
                continue;
            }
            if (input.equals("2")) {
                System.out.println("list job : ");
                Jobs.forEach(job -> job.print());
                continue;
            }
            if (input.equals("3")) {
                for (int x = 0; x < Jobs.size(); x++) {
                    System.out.println("id:" + Jobs.get(x).getJobId() + ", address: " + Jobs.get(x).getJobAddress() + ", job id position: " + Jobs.get(x).getIdJobPosition() + ", job position name: " + Jobs.get(x).getJobPosition());
                }
                System.out.println("Please input id job number");
                int JobId = myObj.nextInt();
                Jobs.remove(JobId - 1);

                for (int x = 0; x < Jobs.size(); x++) {
                    System.out.println("id:" + Jobs.get(x).getJobId() + ", address: " + Jobs.get(x).getJobAddress() + ", job id position: " + Jobs.get(x).getIdJobPosition() + ", job position name: " + Jobs.get(x).getJobPosition());
                }
            }
            if (input.equals("4"))
                break;
        }
    }
}