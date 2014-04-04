package jaspertest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Admin
 */
public class JasperTest {

    static List<Employee> list = new ArrayList<Employee>();

    static Employee findEmployee(int id) {
        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            if (emp.getId() == id) {
                return emp;
            }

        }
        return null;
    }

    static void myFunction(String name) throws IOException {

        Runtime runtime = null;
        runtime = Runtime.getRuntime();
        runtime.exec("rundll32 url.dll,FileProtocolHandler " + name);

    }

    public static void main(String[] args) {

        Employee employee = new Employee(111, "aaa", 100);
        Employee employee1 = new Employee(222, "bbb", 200);
        Employee employee2 = new Employee(333, "ccc", 300);
        Employee employee3 = new Employee(444, "ddd", 400);
        Employee employee4 = new Employee(555, "eee", 500);

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("EmployeeReport.jrxml");
            list.add(employee);
            list.add(employee1);
            list.add(employee2);
            list.add(employee3);
            list.add(employee4);

            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Student id"));
            JOptionPane.showMessageDialog(null, "Get Report");
            Employee resEmployee = findEmployee(id);

            Set set = new HashSet();
            set.add(resEmployee);


            JasperDesign design = JRXmlLoader.load(inputStream);
            JasperReport report = JasperCompileManager.compileReport(design);

            JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), new JRBeanCollectionDataSource(set));

            JasperExportManager.exportReportToPdfFile(print, "E:/EmployeeData.pdf");
            //JasperExportManager.exportReportToHtmlFile(print, "Employee.html");

            // JasperExportManager.exportReportToXmlFile(print, "employee.xml", true);

            //            JasperViewer jasperViewer = new JasperViewer(print);
            //
            //            jasperViewer.setVisible(true);


            myFunction("E:\\EmployeeData.pdf");
            //  JOptionPane.showMessageDialog(null, "Ok");



        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }


        Employee employee5 = new Employee();
        





    }
}
