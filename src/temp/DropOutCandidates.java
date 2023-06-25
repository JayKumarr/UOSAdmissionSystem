//package temp;
//
////~--- non-JDK imports --------------------------------------------------------
//
//import admission.controller.DatabaseManager;
//
//import admission.model.AdmissionListDetails;
//import admission.model.Candidate;
//
////~--- JDK imports ------------------------------------------------------------
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
///**
// *
// * @author Yougeshwar
// */
//public class DropOutCandidates {
//    public static void main(String[] args) {
//        List<Candidate> list = DatabaseManager.getMainCampusCandidates(3, (byte) 1, 2);
//
//        System.out.print("SEATNO,");
//        System.out.print("NAME,");
//        System.out.print("FNAME,");
//        System.out.print("SURNAME,");
//        System.out.print("CATEGORY,");
//        System.out.print("SHIFT,");
//        System.out.print("SEL,");
//        System.out.print("CHOICENO,");
//        System.out.println("LIST");
//
//        for (int i = 0; i < list.size(); i++) {
//            Candidate candidate = list.get(i);
//            Set       set       = candidate.getAdmissionListDetailses();
//
//            if ((set == null) || set.isEmpty()) {
//                continue;
//            }
//
//            for (Iterator it = set.iterator(); it.hasNext(); ) {
//                AdmissionListDetails ald  = (AdmissionListDetails) it.next();
//                Set                  set2 = ald.getPartRegistries();
//
//                if ((set2 == null) || (set2.isEmpty() && (ald.getAdmissionList().getAdmissionListId() == 2))) {
//                    System.out.print(candidate.getSeatNo() + ",");
//                    System.out.print(candidate.getName() + ",");
//                    System.out.print(candidate.getFathersName() + ",");
//                    System.out.print(candidate.getSurname() + ",");
//                    System.out.print(ald.getCampusCategory() + ",");
//                    System.out.print(ald.getAdmissionList().getAdmissionSession().getShift() + ",");
//                    System.out.print(ald.getCposGroup() + ",");
//                    System.out.print(ald.getCandidateProgramOfStudy().getChoiceNo() + ",");
//                    System.out.println(ald.getAdmissionList().getListNo());
//
////                  System.out.print(candidate.getSurname() + ",");
////                  continue;
//                }
//            }
//        }
//
//        System.exit(0);
//    }
//}
//
//
////~ Formatted by Jindent --- http://www.jindent.com
