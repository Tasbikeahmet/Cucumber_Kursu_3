#  Employee menusu için Create-Exist-Delete bölümleri olan Senaryoyu yazınız
#  Daha sonra aynı senaryoru 5 farklı degerler için çalıştırınız.
Feature: Entrance Employee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Create and Delete a Exam
    And Click on the element in the left Nav
      | HumanResources |
      | Employees      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in From content
      | emp_F_Name     | <emp_F_Namelist>     |
      | emp_L_Name     | <emp_L_Namelist>     |
      | EmpId          | <EmpIdlist>          |
      | dokumentNumber | <dokumentNumberlist> |

    And Click on the element in the Form Content
      | gender               |
      | <genderOption>       |

      | EmployeeType         |
      | <EmployeeTypeOption> |


    And Click ESC
    And Click on the element in the Form Content

      | dokumentType  |
      | Passport      |
      | qualification |
      | Master        |
      | address       |
    And User sending the keys in From content
      | Country | <Countrylist> |


    And Click Enter





    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | HumanResources |
      | Employees      |

    And User delete item from Dialog
      | <emp_F_Namelist> |

    Then Success message should be displayed

    Examples:
      | emp_F_Namelist | emp_L_Namelist | genderOption | EmployeeTypeOption | EmpIdlist | dokumentNumberlist | Countrylist |
      | Ahmet10        | Mutlu11        | genderFemale | Teacher            | 12311     | 3452345            | United      |
      | Ahmet12        | Mutlu12        | genderMale   | Supervisor         | 12312     | 2456523            | United      |
      | Ahmet13        | Mutlu13        | genderFemale | Other              | 12313     | 23523462           | United      |
      | Ahmet14        | Mutlu14        | genderMale   | Teacher            | 123124    | 235434254          | United      |
      | Ahmet15        | Mutlu15        | genderFemale | Other              | 123125    | 2354345            | United      |
