package FileO;

import java.io.*;
import java.util.*;

class MyFile {
	 public static void main(String[] args) throws IOException {
		 UpdateHostsFile.run();
	 }
}
 class UpdateHostsFile {
    public static void run() throws IOException {
    	
    	// String referans olu�tur
	    String fileName1 = "MyHost";
	    String line;
	    FileWriter fileWriter1 = new FileWriter(fileName1, true);
	       
    	
    	String fileName2 = "hosts";
    	
    	
		
		FileWriter fileWriter2 = new FileWriter(fileName2, true);
		
	
		
		
        // step 1: MyHost.txt dosyas�n�n i�eri�ini okuyun
        List<String> newHosts = readHostsFile(fileName1);

        // Step 2: hosts dosyas�n�n mevcut i�eri�ini oku
        List<String> existingHosts = readHostsFile(fileName2);

        // Step 3: kopyalar� kald�rarak yeni ana bilgisayarlar� mevcut ana bilgisayarlarla birle�tirin
        Set<String> allHosts = new HashSet<>(existingHosts);
        allHosts.addAll(newHosts);

        // Step 4: ana bilgisayar listesini ana bilgisayar ad�na g�re alfabetik olarak s�rala
        List<String> sortedHosts = new ArrayList<>(allHosts);
        Collections.sort(sortedHosts, new HostComparator());

        // Step 5: g�ncellenen i�eri�i hosts dosyas�na yaz
        writeHostsFile(fileName2, sortedHosts);
    }

    // Step 1: belirtilen dosyan�n i�eri�ini okur ve bir ana bilgisayar listesi d�nd�r�r
    public static List<String> readHostsFile(String filename) {
       
    	List<String> hosts = new ArrayList<>();
        
    	try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    hosts.add(line.trim());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        return hosts;
    }

    // Step 5: belirtilen ana bilgisayar listesini belirtilen dosyaya yazar
    public static void writeHostsFile(String filename, List<String> hosts) {
        
    	try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (String host : hosts) {
                pw.println(host);
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            System.exit(1);
        }
    }

    // iki ana bilgisayar giri�ini ana bilgisayar adlar�na g�re kar��la�t�ran bir kar��la�t�rma s�n�f�
    public static class HostComparator implements Comparator<String> {
        @Override
        public int compare(String host1, String host2) {
            // her ana bilgisayar giri�ini kendi IP adresine ve ana bilgisayar ad� b�l�mlerine ay�r�n
            String[] parts1 = host1.split("\\s+>\\s+");
            String[] parts2 = host2.split("\\s+>\\s+");
            // her ana bilgisayar giri�inin ana bilgisayar ad� b�l�mlerini kar��la�t�r�n
            return parts1[1].compareTo(parts2[1]);
        }
    }
}
