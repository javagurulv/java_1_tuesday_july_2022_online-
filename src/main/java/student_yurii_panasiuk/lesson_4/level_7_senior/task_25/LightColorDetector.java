package student_yurii_panasiuk.lesson_4.level_7_senior.task_25;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Почему класс final?"
		+ "Зачем у этого класса свойство wavelength?")
 class LightColorDetector {
 //int wavelength;

         String wavelength(int wavelength) {

            //  this.wavelength = wavelength;

              if (wavelength >= 380 && wavelength <= 449) {
                  return "Violet";
              } else if (wavelength >= 450 && wavelength <= 494) {
                  return "Blue";
              } else if (wavelength >= 495 && wavelength <= 569) {
                  return "Green";
              } else if (wavelength >= 570 && wavelength <= 589) {
                  return "Yellow";
              } else if (wavelength >= 590 && wavelength <= 619) {
                  return "Orange";
              } else if (wavelength >= 620 && wavelength <= 750) {
                  return "Red";
              } else {
                  return "Invisible Light";
              }
          }


          }


