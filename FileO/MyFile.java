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
    	
    	// String referans oluþtur
	    String fileName1 = "MyHost";
	    String line;
	    FileWriter fileWriter1 = new FileWriter(fileName1, true);
	       
    	
    	String fileName2 = "hosts";
    	
    	
		
		FileWriter fileWriter2 = new FileWriter(fileName2, true);
		
	
		
		
        // step 1: MyHost.txt dosyasýnýn içeriðini okuyun
        List<String> newHosts = readHostsFile(fileName1);

        // Step 2: hosts dosyasýnýn mevcut içeriðini oku
        List<String> existingHosts = readHostsFile(fileName2);

        // Step 3: kopyalarý kaldýrarak yeni ana bilgisayarlarý mevcut ana bilgisayarlarla birleþtirin
        Set<String> allHosts = new HashSet<>(existingHosts);
        allHosts.addAll(newHosts);

        // Step 4: ana bilgisayar listesini ana bilgisayar adýna göre alfabetik olarak sýrala
        List<String> sortedHosts = new ArrayList<>(allHosts);
        Collections.sort(sortedHosts, new HostComparator());

        // Step 5: güncellenen içeriði hosts dosyasýna yaz
        writeHostsFile(fileName2, sortedHosts);
    }

    // Step 1: belirtilen dosyanýn içeriðini okur ve bir ana bilgisayar listesi döndürür
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

    // iki ana bilgisayar giriþini ana bilgisayar adlarýna göre karþýlaþtýran bir karþýlaþtýrma sýnýfý
    public static class HostComparator implements Comparator<String> {
        @Override
        public int compare(String host1, String host2) {
            // her ana bilgisayar giriþini kendi IP adresine ve ana bilgisayar adý bölümlerine ayýrýn
            String[] parts1 = host1.split("\\s+>\\s+");
            String[] parts2 = host2.split("\\s+>\\s+");
            // her ana bilgisayar giriþinin ana bilgisayar adý bölümlerini karþýlaþtýrýn
            return parts1[1].compareTo(parts2[1]);
        }
    }
}
