package com.mycompany.coactvwc.business;

import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.jhipster.web.util.HeaderUtil;

/**
 * REST controller.
 */
@RestController
@RequestMapping("/api")
@Transactional
/*Business Rule Section for microservice COACTVWC */

public class COACTVWC {

    private final Logger log = LoggerFactory.getLogger(COACTVWC.class);

    @PostMapping("COACTVWC/COACTVWC/method1")
    ResponseEntity<JSONObject> method1COACTVWC(@RequestBody JSONObject inputBody) throws Exception, URISyntaxException {
        Integer status = 0;

        log.debug("REST request /COACTVWC/method1 inputBody : " + inputBody);

        JSONObject result = new JSONObject();

        if (inputBody == null) {
            throw new Exception("/ COACTVWC/ method1 inputBody is null");
        }

        return ResponseEntity
            .created(new URI("/api/COACTVWC/method1"))
            .headers(HeaderUtil.createEntityCreationAlert("applicationName", true, "", result.toString()))
            .body(result);
    }

    @GetMapping("COACTVWC/COACTVWC/businesslogic")
    ResponseEntity<String> businesslogicCOACTVWC() throws Exception, URISyntaxException {
        log.debug("GET COACTVWC/COACTVWC/businesslogic");

        String result =
            "\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       0000-MAIN.                                                               \n" +
            "//                                                                                \n" +
            "//           EXEC CICS HANDLE ABEND                                               \n" +
            "//                     LABEL(ABEND-ROUTINE)                                       \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           INITIALIZE CC-WORK-AREA                                              \n" +
            "//                      WS-MISC-STORAGE                                           \n" +
            "//                      WS-COMMAREA                                               \n" +
            "//      *****************************************************************         \n" +
            "//      * Store our context                                                       \n" +
            "//      *****************************************************************         \n" +
            "//           MOVE LIT-THISTRANID       TO WS-TRANID                               \n" +
            "//      *****************************************************************         \n" +
            "//      * Ensure error message is cleared                               *         \n" +
            "//      *****************************************************************         \n" +
            "//           SET WS-RETURN-MSG-OFF  TO TRUE                                       \n" +
            "//      *****************************************************************         \n" +
            "//      * Store passed data if  any                *                              \n" +
            "//      *****************************************************************         \n" +
            "//           IF EIBCALEN IS EQUAL TO 0                                            \n" +
            "//               OR (CDEMO-FROM-PROGRAM = LIT-MENUPGM                             \n" +
            "//               AND NOT CDEMO-PGM-REENTER)                                       \n" +
            "//              INITIALIZE CARDDEMO-COMMAREA                                      \n" +
            "//                         WS-THIS-PROGCOMMAREA                                   \n" +
            "//           ELSE                                                                 \n" +
            "//              MOVE DFHCOMMAREA (1:LENGTH OF CARDDEMO-COMMAREA)  TO              \n" +
            "//                                CARDDEMO-COMMAREA                               \n" +
            "//              MOVE DFHCOMMAREA(LENGTH OF CARDDEMO-COMMAREA + 1:                 \n" +
            "//                               LENGTH OF WS-THIS-PROGCOMMAREA ) TO              \n" +
            "//                                WS-THIS-PROGCOMMAREA                            \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//      *****************************************************************         \n" +
            "//      * Remap PFkeys as needed.                                                 \n" +
            "//      * Store the Mapped PF Key                                                 \n" +
            "//      *****************************************************************         \n" +
            "//           PERFORM YYYY-STORE-PFKEY                                             \n" +
            "//              THRU YYYY-STORE-PFKEY-EXIT                                        \n" +
            "//      *****************************************************************         \n" +
            "//      * Check the AID to see if its valid at this point               *         \n" +
            "//      * F3 - Exit                                                               \n" +
            "//      * Enter show screen again                                                 \n" +
            "//      *****************************************************************         \n" +
            "//           SET PFK-INVALID TO TRUE                                              \n" +
            "//           IF CCARD-AID-ENTER OR                                                \n" +
            "//              CCARD-AID-PFK03                                                   \n" +
            "//              SET PFK-VALID TO TRUE                                             \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           IF PFK-INVALID                                                       \n" +
            "//              SET CCARD-AID-ENTER TO TRUE                                       \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//      *****************************************************************         \n" +
            "//      * Decide what to do based on inputs received                              \n" +
            "//      *****************************************************************         \n" +
            "//      *****************************************************************         \n" +
            "//      *****************************************************************         \n" +
            "//      * Decide what to do based on inputs received                              \n" +
            "//      *****************************************************************         \n" +
            "//           EVALUATE TRUE                                                        \n" +
            "//              WHEN CCARD-AID-PFK03                                              \n" +
            "//      ******************************************************************        \n" +
            "//      *            XCTL TO CALLING PROGRAM OR MAIN MENU                         \n" +
            "//      ******************************************************************        \n" +
            "//                   IF CDEMO-FROM-TRANID    EQUAL LOW-VALUES                     \n" +
            "//                   OR CDEMO-FROM-TRANID    EQUAL SPACES                         \n" +
            "//                      MOVE LIT-MENUTRANID  TO CDEMO-TO-TRANID                   \n" +
            "//                   ELSE                                                         \n" +
            "//                      MOVE CDEMO-FROM-TRANID  TO CDEMO-TO-TRANID                \n" +
            "//                   END-IF                                                       \n" +
            "//                   IF CDEMO-FROM-PROGRAM   EQUAL LOW-VALUES                     \n" +
            "//                   OR CDEMO-FROM-PROGRAM   EQUAL SPACES                         \n" +
            "//                      MOVE LIT-MENUPGM     TO CDEMO-TO-PROGRAM                  \n" +
            "//                   ELSE                                                         \n" +
            "//                      MOVE CDEMO-FROM-PROGRAM TO CDEMO-TO-PROGRAM               \n" +
            "//                   END-IF                                                       \n" +
            "//                                                                                \n" +
            "//                   MOVE LIT-THISTRANID     TO CDEMO-FROM-TRANID                 \n" +
            "//                   MOVE LIT-THISPGM        TO CDEMO-FROM-PROGRAM                \n" +
            "//                                                                                \n" +
            "//                   SET  CDEMO-USRTYP-USER  TO TRUE                              \n" +
            "//                   SET  CDEMO-PGM-ENTER    TO TRUE                              \n" +
            "//                   MOVE LIT-THISMAPSET     TO CDEMO-LAST-MAPSET                 \n" +
            "//                   MOVE LIT-THISMAP        TO CDEMO-LAST-MAP                    \n" +
            "//      *                                                                         \n" +
            "//                   EXEC CICS XCTL                                               \n" +
            "//                             PROGRAM (CDEMO-TO-PROGRAM)                         \n" +
            "//                             COMMAREA(CARDDEMO-COMMAREA)                        \n" +
            "//                   END-EXEC                                                     \n" +
            "//              WHEN CDEMO-PGM-ENTER                                              \n" +
            "//      ******************************************************************        \n" +
            "//      *            COMING FROM SOME OTHER CONTEXT                               \n" +
            "//      *            SELECTION CRITERIA TO BE GATHERED                            \n" +
            "//      ******************************************************************        \n" +
            "//                   PERFORM 1000-SEND-MAP THRU                                   \n" +
            "//                           1000-SEND-MAP-EXIT                                   \n" +
            "//                   GO TO COMMON-RETURN                                          \n" +
            "//              WHEN CDEMO-PGM-REENTER                                            \n" +
            "//                   PERFORM 2000-PROCESS-INPUTS                                  \n" +
            "//                      THRU 2000-PROCESS-INPUTS-EXIT                             \n" +
            "//                   IF INPUT-ERROR                                               \n" +
            "//                      PERFORM 1000-SEND-MAP                                     \n" +
            "//                         THRU 1000-SEND-MAP-EXIT                                \n" +
            "//                      GO TO COMMON-RETURN                                       \n" +
            "//                   ELSE                                                         \n" +
            "//                      PERFORM 9000-READ-ACCT                                    \n" +
            "//                         THRU 9000-READ-ACCT-EXIT                               \n" +
            "//                      PERFORM 1000-SEND-MAP                                     \n" +
            "//                         THRU 1000-SEND-MAP-EXIT                                \n" +
            "//                      GO TO COMMON-RETURN                                       \n" +
            "//                   END-IF                                                       \n" +
            "//             WHEN OTHER                                                         \n" +
            "//                   MOVE LIT-THISPGM    TO ABEND-CULPRIT                         \n" +
            "//                   MOVE '0001'         TO ABEND-CODE                            \n" +
            "//                   MOVE SPACES         TO ABEND-REASON                          \n" +
            "//                   MOVE 'UNEXPECTED DATA SCENARIO'                              \n" +
            "//                                       TO WS-RETURN-MSG                         \n" +
            "//                   PERFORM SEND-PLAIN-TEXT                                      \n" +
            "//                      THRU SEND-PLAIN-TEXT-EXIT                                 \n" +
            "//           END-EVALUATE                                                         \n" +
            "//                                                                                \n" +
            "//      * If we had an error setup error message that slipped through             \n" +
            "//      * Display and return                                                      \n" +
            "//           IF INPUT-ERROR                                                       \n" +
            "//              MOVE WS-RETURN-MSG  TO CCARD-ERROR-MSG                            \n" +
            "//              PERFORM 1000-SEND-MAP                                             \n" +
            "//                 THRU 1000-SEND-MAP-EXIT                                        \n" +
            "//              GO TO COMMON-RETURN                                               \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void Main(){\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1212        EXEC CICS HANDLE ABEND                                                                    LABEL(ABEND-ROUTINE)                                                  END-EXEC    */  \n" +
            "\n" +
            "//      /* TODO Initialize statement not yet translated.  Ln:1216        INITIALIZE CC-WORK-AREA    */ \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Store our context                                                       \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      setWsTranid(getLitThistranid());\n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Ensure error message is cleared                               *         \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      wsReturnMsgOff = = true;\n" +
            "\n" +
            "//      // ****************************************************************             //  Store passed data if  any                *                                  // ****************************************************************         \n" +
            "\n" +
            "//      if (getEibcalen().equals(0)\n" +
            "\n" +
            "//          || !getEibcalen().equals((getCdemoFromProgram().equals(getLitMenupgm())        && !getCdemoPgmReenter())))    {\n" +
            "\n" +
            "//          /* TODO Initialize statement not yet translated.  Ln:1233            INITIALIZE CARDDEMO-COMMAREA        */     }\n" +
            "\n" +
            "//      else    {\n" +
            "\n" +
            "//          setCarddemoCommarea(getDfhcommarea().Substring(1, carddemoCommarea.Length()));\n" +
            "\n" +
            "//          setWsThisProgcommarea(getDfhcommarea().Substring(carddemoCommarea.Length()\n" +
            "\n" +
            "//              + 1, wsThisProgcommarea.Length()));    }\n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Remap PFkeys as needed.                                                 \n" +
            "\n" +
            "//      //  Store the Mapped PF Key                                                 \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      YyyyStorePfkey(); /*To:YyyyStorePfkeyExit*/\n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Check the AID to see if its valid at this point               *         \n" +
            "\n" +
            "//      //  F3 - Exit                                                               \n" +
            "\n" +
            "//      //  Enter show screen again                                                 \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      pfkInvalid = = true;\n" +
            "\n" +
            "//      if (getCcardAidEnter()\n" +
            "\n" +
            "//          || getCcardAidPfk03())    {\n" +
            "\n" +
            "//          pfkValid = = true;    }\n" +
            "\n" +
            "//      if (getPfkInvalid())    {\n" +
            "\n" +
            "//          ccardAidEnter = = true;    }\n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Decide what to do based on inputs received                              \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      //  Decide what to do based on inputs received                              \n" +
            "\n" +
            "//      // ****************************************************************         \n" +
            "\n" +
            "//      if (getCcardAidPfk03())\n" +
            "\n" +
            "//      // *****************************************************************        \n" +
            "\n" +
            "//      //             XCTL TO CALLING PROGRAM OR MAIN MENU                         \n" +
            "\n" +
            "//      // *****************************************************************            {\n" +
            "\n" +
            "//          if (getCdemoFromTranid().equals(null)\n" +
            "\n" +
            "//              || getCdemoFromTranid().equals(\" \"))        {\n" +
            "\n" +
            "//              setCdemoToTranid(getLitMenutranid());        }\n" +
            "\n" +
            "//          else        {\n" +
            "\n" +
            "//              setCdemoToTranid(getCdemoFromTranid());        }\n" +
            "\n" +
            "//          if (getCdemoFromProgram().equals(null)\n" +
            "\n" +
            "//              || getCdemoFromProgram().equals(\" \"))        {\n" +
            "\n" +
            "//              setCdemoToProgram(getLitMenupgm());        }\n" +
            "\n" +
            "//          else        {\n" +
            "\n" +
            "//              setCdemoToProgram(getCdemoFromProgram());        }\n" +
            "\n" +
            "//          setCdemoFromTranid(getLitThistranid());\n" +
            "\n" +
            "//          setCdemoFromProgram(getLitThispgm());\n" +
            "\n" +
            "//          cdemoUsrtypUser = = true;\n" +
            "\n" +
            "//          cdemoPgmEnter = = true;\n" +
            "\n" +
            "//          setCdemoLastMapset(getLitThismapset());\n" +
            "\n" +
            "//          setCdemoLastMap(getLitThismap());\n" +
            "\n" +
            "//          //                                                                          \n" +
            "\n" +
            "//          /* TODO Exec CICS statement not yet translated.  Ln:1297            EXEC CICS XCTL                                                                            PROGRAM (CDEMO-TO-PROGRAM)                                                      COMMAREA(CARDDEMO-COMMAREA)                                           END-EXEC        */      }    \n" +
            "\n" +
            "//      else if (getCdemoPgmEnter())\n" +
            "\n" +
            "//      // *****************************************************************        \n" +
            "\n" +
            "//      //             COMING FROM SOME OTHER CONTEXT                               \n" +
            "\n" +
            "//      //             SELECTION CRITERIA TO BE GATHERED                            \n" +
            "\n" +
            "//      // *****************************************************************            {\n" +
            "\n" +
            "//          SendMap(); /*To:SendMapExit*/\n" +
            "\n" +
            "//          /* TODO Untranslated GoTo found. \" Go TO CommonReturn\" Ln:1308 */    }    \n" +
            "\n" +
            "//      else if (getCdemoPgmReenter())    {\n" +
            "\n" +
            "//          ProcessInputs(); /*To:ProcessInputsExit*/\n" +
            "\n" +
            "//          if (getInputError())        {\n" +
            "\n" +
            "//              SendMap(); /*To:SendMapExit*/\n" +
            "\n" +
            "//              /* TODO Untranslated GoTo found. \" Go TO CommonReturn\" Ln:1315 */        }\n" +
            "\n" +
            "//          else        {\n" +
            "\n" +
            "//              ReadAcct(); /*To:ReadAcctExit*/\n" +
            "\n" +
            "//              SendMap(); /*To:SendMapExit*/\n" +
            "\n" +
            "//              /* TODO Untranslated GoTo found. \" Go TO CommonReturn\" Ln:1321 */        }    }    \n" +
            "\n" +
            "//      else if (default:)    {\n" +
            "\n" +
            "//          setAbendCulprit(getLitThispgm());\n" +
            "\n" +
            "//          setAbendCode(\"0001\");\n" +
            "\n" +
            "//          setAbendReason(\" \");\n" +
            "\n" +
            "//          setWsReturnMsg(\"UNEXPECTED DATA SCENARIO\");\n" +
            "\n" +
            "//          SendPlainText(); /*To:SendPlainTextExit*/    }    \n" +
            "\n" +
            "//      //  If we had an error setup error message that slipped through             \n" +
            "\n" +
            "//      //  Display and return                                                      \n" +
            "\n" +
            "//      if (getInputError())    {\n" +
            "\n" +
            "//          setCcardErrorMsg(getWsReturnMsg());\n" +
            "\n" +
            "//          SendMap(); /*To:SendMapExit*/    } }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       COMMON-RETURN.                                                           \n" +
            "//           MOVE WS-RETURN-MSG     TO CCARD-ERROR-MSG                            \n" +
            "//                                                                                \n" +
            "//           MOVE  CARDDEMO-COMMAREA    TO WS-COMMAREA                            \n" +
            "//           MOVE  WS-THIS-PROGCOMMAREA TO                                        \n" +
            "//                  WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA + 1:                  \n" +
            "//                               LENGTH OF WS-THIS-PROGCOMMAREA )                 \n" +
            "//                                                                                \n" +
            "//           EXEC CICS RETURN                                                     \n" +
            "//                TRANSID (LIT-THISTRANID)                                        \n" +
            "//                COMMAREA (WS-COMMAREA)                                          \n" +
            "//                LENGTH(LENGTH OF WS-COMMAREA)                                   \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void CommonReturn(){\n" +
            "\n" +
            "//      setCcardErrorMsg(getWsReturnMsg());\n" +
            "\n" +
            "//      setWsCommarea(getCarddemoCommarea());\n" +
            "\n" +
            "//          wsThisProgcommarea.Length())(getWsThisProgcommarea());        EXEC CICS RETURN                                                                     TRANSID (LIT-THISTRANID)                                                        COMMAREA (WS-COMMAREA)                                                          LENGTH(LENGTH OF WS-COMMAREA)                                              END-EXEC    */   }\n" +
            "\n" +
            "//      setWsCommarea.Substring(carddemoCommarea.Length() + 1,\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       0000-MAIN-EXIT.                                                          \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void MainExit(){}\n" +
            "\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void MainExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1000-SEND-MAP.                                                           \n" +
            "//           PERFORM 1100-SCREEN-INIT                                             \n" +
            "//              THRU 1100-SCREEN-INIT-EXIT                                        \n" +
            "//           PERFORM 1200-SETUP-SCREEN-VARS                                       \n" +
            "//              THRU 1200-SETUP-SCREEN-VARS-EXIT                                  \n" +
            "//           PERFORM 1300-SETUP-SCREEN-ATTRS                                      \n" +
            "//              THRU 1300-SETUP-SCREEN-ATTRS-EXIT                                 \n" +
            "//           PERFORM 1400-SEND-SCREEN                                             \n" +
            "//              THRU 1400-SEND-SCREEN-EXIT                                        \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendMap(){\n" +
            "\n" +
            "//      ScreenInit(); /*To:ScreenInitExit*/\n" +
            "\n" +
            "//      SetupScreenVars(); /*To:SetupScreenVarsExit*/\n" +
            "\n" +
            "//      SetupScreenAttrs(); /*To:SetupScreenAttrsExit*/\n" +
            "\n" +
            "//  }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1000-SEND-MAP-EXIT.                                                      \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendMapExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1100-SCREEN-INIT.                                                        \n" +
            "//           MOVE LOW-VALUES             TO CACTVWAO                              \n" +
            "//                                                                                \n" +
            "//           MOVE FUNCTION CURRENT-DATE  TO WS-CURDATE-DATA                       \n" +
            "//                                                                                \n" +
            "//           MOVE CCDA-TITLE01           TO TITLE01O OF CACTVWAO                  \n" +
            "//           MOVE CCDA-TITLE02           TO TITLE02O OF CACTVWAO                  \n" +
            "//           MOVE LIT-THISTRANID         TO TRNNAMEO OF CACTVWAO                  \n" +
            "//           MOVE LIT-THISPGM            TO PGMNAMEO OF CACTVWAO                  \n" +
            "//                                                                                \n" +
            "//           MOVE FUNCTION CURRENT-DATE  TO WS-CURDATE-DATA                       \n" +
            "//                                                                                \n" +
            "//           MOVE WS-CURDATE-MONTH       TO WS-CURDATE-MM                         \n" +
            "//           MOVE WS-CURDATE-DAY         TO WS-CURDATE-DD                         \n" +
            "//           MOVE WS-CURDATE-YEAR(3:2)   TO WS-CURDATE-YY                         \n" +
            "//                                                                                \n" +
            "//           MOVE WS-CURDATE-MM-DD-YY    TO CURDATEO OF CACTVWAO                  \n" +
            "//                                                                                \n" +
            "//           MOVE WS-CURTIME-HOURS       TO WS-CURTIME-HH                         \n" +
            "//           MOVE WS-CURTIME-MINUTE      TO WS-CURTIME-MM                         \n" +
            "//           MOVE WS-CURTIME-SECOND      TO WS-CURTIME-SS                         \n" +
            "//                                                                                \n" +
            "//           MOVE WS-CURTIME-HH-MM-SS    TO CURTIMEO OF CACTVWAO                  \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ScreenInit(){\n" +
            "\n" +
            "//      setCactvwao(null);\n" +
            "\n" +
            "//      setWsCurdateData(CURRENT-DATE( ));\n" +
            "\n" +
            "//      getCactvwao().setTitle01o(getCcdaTitle01());\n" +
            "\n" +
            "//      getCactvwao().setTitle02o(getCcdaTitle02());\n" +
            "\n" +
            "//      getCactvwao().setTrnnameo(getLitThistranid());\n" +
            "\n" +
            "//      getCactvwao().setPgmnameo(getLitThispgm());\n" +
            "\n" +
            "//      setWsCurdateData(CURRENT-DATE( ));\n" +
            "\n" +
            "//      setWsCurdateMm(getWsCurdateMonth());\n" +
            "\n" +
            "//      setWsCurdateDd(getWsCurdateDay());\n" +
            "\n" +
            "//      setWsCurdateYy(getWsCurdateYear().Substring(3, 2));\n" +
            "\n" +
            "//      getCactvwao().setCurdateo(getWsCurdateMmDdYy());\n" +
            "\n" +
            "//      setWsCurtimeHh(getWsCurtimeHours());\n" +
            "\n" +
            "//      setWsCurtimeMm(getWsCurtimeMinute());\n" +
            "\n" +
            "//      setWsCurtimeSs(getWsCurtimeSecond());}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1100-SCREEN-INIT-EXIT.                                                   \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ScreenInitExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1200-SETUP-SCREEN-VARS.                                                  \n" +
            "//      *    INITIALIZE SEARCH CRITERIA                                           \n" +
            "//           IF EIBCALEN = 0                                                      \n" +
            "//              SET  WS-PROMPT-FOR-INPUT TO TRUE                                  \n" +
            "//           ELSE\n" +
            "//              IF FLG-ACCTFILTER-BLANK  \n" +
            "//                 MOVE LOW-VALUES   TO ACCTSIDO OF CACTVWAO                      \n" +
            "//              ELSE                                                              \n" +
            "//                 MOVE CC-ACCT-ID   TO ACCTSIDO OF CACTVWAO                      \n" +
            "//              END-IF                                                            \n" +
            "//                                                                                \n" +
            "//              IF FOUND-ACCT-IN-MASTER                                           \n" +
            "//              OR FOUND-CUST-IN-MASTER                                           \n" +
            "//                 MOVE ACCT-ACTIVE-STATUS  TO ACSTTUSO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-CURR-BAL       TO ACURBALO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-CREDIT-LIMIT   TO ACRDLIMO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-CASH-CREDIT-LIMIT\n" +
            "//                                          TO ACSHLIMO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-CURR-CYC-CREDIT          \n" +
            "//                                          TO ACRCYCRO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-CURR-CYC-DEBIT TO ACRCYDBO OF CACTVWAO               \n" +
            "//                                                                                \n" +
            "//                 MOVE ACCT-OPEN-DATE      TO ADTOPENO OF CACTVWAO               \n" +
            "//                 MOVE ACCT-EXPIRAION-DATE TO AEXPDTO  OF CACTVWAO               \n" +
            "//                 MOVE ACCT-REISSUE-DATE   TO AREISDTO OF CACTVWAO               \n" +
            "//                 MOVE ACCT-GROUP-ID       TO AADDGRPO OF CACTVWAO               \n" +
            "//              END-IF                                                            \n" +
            "//                                                                                \n" +
            "//              IF FOUND-CUST-IN-MASTER                                           \n" +
            "//                MOVE CUST-ID              TO ACSTNUMO OF CACTVWAO               \n" +
            "//      *         MOVE CUST-SSN             TO ACSTSSNO OF CACTVWAO       \n" +
            "//                STRING \n" +
            "//                    CUST-SSN(1:3)\n" +
            "//                    '-'                 \n" +
            "//                    CUST-SSN(4:2)\n" +
            "//                    '-'\n" +
            "//                    CUST-SSN(6:4)\n" +
            "//                    DELIMITED BY SIZE\n" +
            "//                    INTO ACSTSSNO OF CACTVWAO\n" +
            "//                END-STRING                                                      \n" +
            "//                MOVE CUST-FICO-CREDIT-SCORE                                     \n" +
            "//                                          TO ACSTFCOO OF CACTVWAO               \n" +
            "//                MOVE CUST-DOB-YYYY-MM-DD  TO ACSTDOBO OF CACTVWAO               \n" +
            "//                MOVE CUST-FIRST-NAME      TO ACSFNAMO OF CACTVWAO               \n" +
            "//                MOVE CUST-MIDDLE-NAME     TO ACSMNAMO OF CACTVWAO               \n" +
            "//                MOVE CUST-LAST-NAME       TO ACSLNAMO OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-LINE-1     TO ACSADL1O OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-LINE-2     TO ACSADL2O OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-LINE-3     TO ACSCITYO OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-STATE-CD   TO ACSSTTEO OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-ZIP        TO ACSZIPCO OF CACTVWAO               \n" +
            "//                MOVE CUST-ADDR-COUNTRY-CD TO ACSCTRYO OF CACTVWAO               \n" +
            "//                MOVE CUST-PHONE-NUM-1     TO ACSPHN1O OF CACTVWAO               \n" +
            "//                MOVE CUST-PHONE-NUM-2     TO ACSPHN2O OF CACTVWAO               \n" +
            "//                MOVE CUST-GOVT-ISSUED-ID  TO ACSGOVTO OF CACTVWAO               \n" +
            "//                MOVE CUST-EFT-ACCOUNT-ID  TO ACSEFTCO OF CACTVWAO               \n" +
            "//                MOVE CUST-PRI-CARD-HOLDER-IND                                   \n" +
            "//                                          TO ACSPFLGO OF CACTVWAO               \n" +
            "//              END-IF                                                            \n" +
            "//                                                                                \n" +
            "//            END-IF                                                              \n" +
            "//                                                                                \n" +
            "//      *    SETUP MESSAGE                                                        \n" +
            "//           IF WS-NO-INFO-MESSAGE                                                \n" +
            "//             SET WS-PROMPT-FOR-INPUT TO TRUE                                    \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           MOVE WS-RETURN-MSG          TO ERRMSGO OF CACTVWAO                   \n" +
            "//                                                                                \n" +
            "//           MOVE WS-INFO-MSG            TO INFOMSGO OF CACTVWAO                  \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SetupScreenVars()\n" +
            "\n" +
            "//  //     INITIALIZE SEARCH CRITERIA                                           {\n" +
            "\n" +
            "//      if (getEibcalen().equals(0))    {\n" +
            "\n" +
            "//          wsPromptForInput = = true;    }\n" +
            "\n" +
            "//      else    {\n" +
            "\n" +
            "//          if (getFlgAcctfilterBlank())        {\n" +
            "\n" +
            "//              getCactvwao().setAcctsido(null);        }\n" +
            "\n" +
            "//          else        {\n" +
            "\n" +
            "//              getCactvwao().setAcctsido(getCcAcctId());        }\n" +
            "\n" +
            "//          if (getFoundAcctInMaster()\n" +
            "\n" +
            "//              || getFoundCustInMaster())        {\n" +
            "\n" +
            "//              getCactvwao().setAcsttuso(getAcctActiveStatus());\n" +
            "\n" +
            "//              getCactvwao().setAcurbalo(getAcctCurrBal());\n" +
            "\n" +
            "//              getCactvwao().setAcrdlimo(getAcctCreditLimit());\n" +
            "\n" +
            "//              getCactvwao().setAcshlimo(getAcctCashCreditLimit());\n" +
            "\n" +
            "//              getCactvwao().setAcrcycro(getAcctCurrCycCredit());\n" +
            "\n" +
            "//              getCactvwao().setAcrcydbo(getAcctCurrCycDebit());\n" +
            "\n" +
            "//              getCactvwao().setAdtopeno(getAcctOpenDate());\n" +
            "\n" +
            "//              getCactvwao().setAexpdto(getAcctExpiraionDate());\n" +
            "\n" +
            "//              getCactvwao().setAreisdto(getAcctReissueDate());\n" +
            "\n" +
            "//              getCactvwao().setAaddgrpo(getAcctGroupId());        }\n" +
            "\n" +
            "//          if (getFoundCustInMaster())        {\n" +
            "\n" +
            "//              getCactvwao().setAcstnumo(getCustId());\n" +
            "\n" +
            "//              //          MOVE CUST-SSN             TO ACSTSSNO OF CACTVWAO       \n" +
            "\n" +
            "//              getCactvwao().setAcstssno(getCustSsn().Substring(1,\n" +
            "\n" +
            "//                  3).equals(getCustSsn().Substring(4, 2)) + \"-\" + getCustSsn().Substring(6,                4));\n" +
            "\n" +
            "//              getCactvwao().setAcstfcoo(getCustFicoCreditScore());\n" +
            "\n" +
            "//              getCactvwao().setAcstdobo(getCustDobYyyyMmDd());\n" +
            "\n" +
            "//              getCactvwao().setAcsfnamo(getCustFirstName());\n" +
            "\n" +
            "//              getCactvwao().setAcsmnamo(getCustMiddleName());\n" +
            "\n" +
            "//              getCactvwao().setAcslnamo(getCustLastName());\n" +
            "\n" +
            "//              getCactvwao().setAcsadl1o(getCustAddrLine1());\n" +
            "\n" +
            "//              getCactvwao().setAcsadl2o(getCustAddrLine2());\n" +
            "\n" +
            "//              getCactvwao().setAcscityo(getCustAddrLine3());\n" +
            "\n" +
            "//              getCactvwao().setAcsstteo(getCustAddrStateCd());\n" +
            "\n" +
            "//              getCactvwao().setAcszipco(getCustAddrZip());\n" +
            "\n" +
            "//              getCactvwao().setAcsctryo(getCustAddrCountryCd());\n" +
            "\n" +
            "//              getCactvwao().setAcsphn1o(getCustPhoneNum1());\n" +
            "\n" +
            "//              getCactvwao().setAcsphn2o(getCustPhoneNum2());\n" +
            "\n" +
            "//              getCactvwao().setAcsgovto(getCustGovtIssuedId());\n" +
            "\n" +
            "//              getCactvwao().setAcseftco(getCustEftAccountId());\n" +
            "\n" +
            "//              getCactvwao().setAcspflgo(getCustPriCardHolderInd());        }    }\n" +
            "\n" +
            "//      //     SETUP MESSAGE                                                        \n" +
            "\n" +
            "//      if (getWsNoInfoMessage())    {\n" +
            "\n" +
            "//          wsPromptForInput = = true;    }\n" +
            "\n" +
            "//      getCactvwao().setErrmsgo(getWsReturnMsg());}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1200-SETUP-SCREEN-VARS-EXIT.                                             \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SetupScreenVarsExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1300-SETUP-SCREEN-ATTRS.                                                 \n" +
            "//      *    PROTECT OR UNPROTECT BASED ON CONTEXT                                \n" +
            "//           MOVE DFHBMFSE               TO ACCTSIDA OF CACTVWAI                  \n" +
            "//                                                                                \n" +
            "//      *    POSITION CURSOR                                                      \n" +
            "//           EVALUATE TRUE                                                        \n" +
            "//              WHEN FLG-ACCTFILTER-NOT-OK                                        \n" +
            "//              WHEN FLG-ACCTFILTER-BLANK                                         \n" +
            "//                   MOVE -1             TO ACCTSIDL OF CACTVWAI                  \n" +
            "//              WHEN OTHER                                                        \n" +
            "//                   MOVE -1             TO ACCTSIDL OF CACTVWAI                  \n" +
            "//           END-EVALUATE                                                         \n" +
            "//                                                                                \n" +
            "//      *    SETUP COLOR                                                          \n" +
            "//           MOVE DFHDFCOL               TO ACCTSIDC OF CACTVWAO                  \n" +
            "//                                                                                \n" +
            "//           IF FLG-ACCTFILTER-NOT-OK                                             \n" +
            "//              MOVE DFHRED              TO ACCTSIDC OF CACTVWAO                  \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           IF  FLG-ACCTFILTER-BLANK                                             \n" +
            "//           AND CDEMO-PGM-REENTER                                                \n" +
            "//               MOVE '*'                TO ACCTSIDO OF CACTVWAO                  \n" +
            "//               MOVE DFHRED             TO ACCTSIDC OF CACTVWAO                  \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           IF  WS-NO-INFO-MESSAGE                                               \n" +
            "//               MOVE DFHBMDAR           TO INFOMSGC OF CACTVWAO                  \n" +
            "//           ELSE                                                                 \n" +
            "//               MOVE DFHNEUTR           TO INFOMSGC OF CACTVWAO                  \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SetupScreenAttrs()\n" +
            "\n" +
            "//  //     PROTECT OR UNPROTECT BASED ON CONTEXT                                {\n" +
            "\n" +
            "//      getCactvwai().setAcctsida(getDfhbmfse());\n" +
            "\n" +
            "//      //     POSITION CURSOR                                                      \n" +
            "\n" +
            "//      if (getFlgAcctfilterNotOk())    {            }    \n" +
            "\n" +
            "//      else if (getFlgAcctfilterBlank())    {\n" +
            "\n" +
            "//          getCactvwai().setAcctsidl(-1);    }    \n" +
            "\n" +
            "//      else if (default:)    {\n" +
            "\n" +
            "//          getCactvwai().setAcctsidl(-1);    }    \n" +
            "\n" +
            "//      //     SETUP COLOR                                                          \n" +
            "\n" +
            "//      getCactvwao().setAcctsidc(getDfhdfcol());\n" +
            "\n" +
            "//      if (getFlgAcctfilterNotOk())    {\n" +
            "\n" +
            "//          getCactvwao().setAcctsidc(getDfhred());    }\n" +
            "\n" +
            "//      if (getFlgAcctfilterBlank()\n" +
            "\n" +
            "//          && getCdemoPgmReenter())    {\n" +
            "\n" +
            "//          getCactvwao().setAcctsido(\"*\");\n" +
            "\n" +
            "//          getCactvwao().setAcctsidc(getDfhred());    }\n" +
            "\n" +
            "//      if (getWsNoInfoMessage())    {\n" +
            "\n" +
            "//          getCactvwao().setInfomsgc(getDfhbmdar());    }\n" +
            "\n" +
            "//      else    {    } }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1300-SETUP-SCREEN-ATTRS-EXIT.                                            \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SetupScreenAttrsExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1400-SEND-SCREEN.                                                        \n" +
            "//                                                                                \n" +
            "//           MOVE LIT-THISMAPSET         TO CCARD-NEXT-MAPSET                     \n" +
            "//           MOVE LIT-THISMAP            TO CCARD-NEXT-MAP                        \n" +
            "//           SET  CDEMO-PGM-REENTER TO TRUE                                       \n" +
            "//                                                                                \n" +
            "//           EXEC CICS SEND MAP(CCARD-NEXT-MAP)                                   \n" +
            "//                          MAPSET(CCARD-NEXT-MAPSET)                             \n" +
            "//                          FROM(CACTVWAO)                                        \n" +
            "//                          CURSOR                                                \n" +
            "//                          ERASE                                                 \n" +
            "//                          FREEKB                                                \n" +
            "//                          RESP(WS-RESP-CD)                                      \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendScreen(){\n" +
            "\n" +
            "//      setCcardNextMapset(getLitThismapset());\n" +
            "\n" +
            "//      setCcardNextMap(getLitThismap());\n" +
            "\n" +
            "//      cdemoPgmReenter = = true;        EXEC CICS SEND MAP(CCARD-NEXT-MAP)                                                             MAPSET(CCARD-NEXT-MAPSET)                                                       FROM(CACTVWAO)                                                                  CURSOR                                                                          ERASE                                                                           FREEKB                                                                          RESP(WS-RESP-CD)                                                 END-EXEC    */   }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       1400-SEND-SCREEN-EXIT.                                                   \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendScreenExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2000-PROCESS-INPUTS.                                                     \n" +
            "//           PERFORM 2100-RECEIVE-MAP                                             \n" +
            "//              THRU 2100-RECEIVE-MAP-EXIT                                        \n" +
            "//           PERFORM 2200-EDIT-MAP-INPUTS                                         \n" +
            "//              THRU 2200-EDIT-MAP-INPUTS-EXIT                                    \n" +
            "//           MOVE WS-RETURN-MSG  TO CCARD-ERROR-MSG                               \n" +
            "//           MOVE LIT-THISPGM    TO CCARD-NEXT-PROG                               \n" +
            "//           MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET                             \n" +
            "//           MOVE LIT-THISMAP    TO CCARD-NEXT-MAP                                \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ProcessInputs(){\n" +
            "\n" +
            "//      ReceiveMap(); /*To:ReceiveMapExit*/\n" +
            "\n" +
            "//      EditMapInputs(); /*To:EditMapInputsExit*/\n" +
            "\n" +
            "//      setCcardErrorMsg(getWsReturnMsg());\n" +
            "\n" +
            "//      setCcardNextProg(getLitThispgm());\n" +
            "\n" +
            "//      setCcardNextMapset(getLitThismapset());}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2000-PROCESS-INPUTS-EXIT.                                                \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ProcessInputsExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2100-RECEIVE-MAP.                                                        \n" +
            "//           EXEC CICS RECEIVE MAP(LIT-THISMAP)                                   \n" +
            "//                     MAPSET(LIT-THISMAPSET)                                     \n" +
            "//                     INTO(CACTVWAI)                                             \n" +
            "//                     RESP(WS-RESP-CD)                                           \n" +
            "//                     RESP2(WS-REAS-CD)                                          \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ReceiveMap(){        EXEC CICS RECEIVE MAP(LIT-THISMAP)                                                        MAPSET(LIT-THISMAPSET)                                                          INTO(CACTVWAI)                                                                  RESP(WS-RESP-CD)                                                                RESP2(WS-REAS-CD)                                                     END-EXEC    */   }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2100-RECEIVE-MAP-EXIT.                                                   \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ReceiveMapExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2200-EDIT-MAP-INPUTS.                                                    \n" +
            "//                                                                                \n" +
            "//           SET INPUT-OK                  TO TRUE                                \n" +
            "//           SET FLG-ACCTFILTER-ISVALID    TO TRUE                                \n" +
            "//                                                                                \n" +
            "//      *    REPLACE * WITH LOW-VALUES                                            \n" +
            "//           IF  ACCTSIDI OF CACTVWAI = '*'                                       \n" +
            "//           OR  ACCTSIDI OF CACTVWAI = SPACES                                    \n" +
            "//               MOVE LOW-VALUES           TO  CC-ACCT-ID                         \n" +
            "//           ELSE                                                                 \n" +
            "//               MOVE ACCTSIDI OF CACTVWAI TO  CC-ACCT-ID                         \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//      *    INDIVIDUAL FIELD EDITS                                               \n" +
            "//           PERFORM 2210-EDIT-ACCOUNT                                            \n" +
            "//              THRU 2210-EDIT-ACCOUNT-EXIT                                       \n" +
            "//                                                                                \n" +
            "//      *    CROSS FIELD EDITS                                                    \n" +
            "//           IF  FLG-ACCTFILTER-BLANK                                             \n" +
            "//               SET NO-SEARCH-CRITERIA-RECEIVED TO TRUE                          \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void EditMapInputs(){\n" +
            "\n" +
            "//      inputOk = = true;\n" +
            "\n" +
            "//      flgAcctfilterIsvalid = = true;\n" +
            "\n" +
            "//      //     REPLACE * WITH LOW-VALUES                                            \n" +
            "\n" +
            "//      if (\"*\".equals(getCactvwai().getAcctsidi())\n" +
            "\n" +
            "//          || getCactvwai().getAcctsidi().equals(\" \"))    {\n" +
            "\n" +
            "//          setCcAcctId(null);    }\n" +
            "\n" +
            "//      else    {\n" +
            "\n" +
            "//          setCcAcctId(getCactvwai().getAcctsidi());    }\n" +
            "\n" +
            "//      //     INDIVIDUAL FIELD EDITS                                               \n" +
            "\n" +
            "//      EditAccount(); /*To:EditAccountExit*/\n" +
            "\n" +
            "//      //     CROSS FIELD EDITS                                                    \n" +
            "\n" +
            "//      if (getFlgAcctfilterBlank())    {    } }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2200-EDIT-MAP-INPUTS-EXIT.                                               \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void EditMapInputsExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2210-EDIT-ACCOUNT.                                                       \n" +
            "//           SET FLG-ACCTFILTER-NOT-OK TO TRUE                                    \n" +
            "//                                                                                \n" +
            "//      *    Not supplied                                                         \n" +
            "//           IF CC-ACCT-ID   EQUAL LOW-VALUES                                     \n" +
            "//           OR CC-ACCT-ID   EQUAL SPACES                                         \n" +
            "//              SET INPUT-ERROR           TO TRUE                                 \n" +
            "//              SET FLG-ACCTFILTER-BLANK  TO TRUE                                 \n" +
            "//              IF WS-RETURN-MSG-OFF                                              \n" +
            "//                 SET WS-PROMPT-FOR-ACCT TO TRUE                                 \n" +
            "//              END-IF                                                            \n" +
            "//              MOVE ZEROES       TO CDEMO-ACCT-ID                                \n" +
            "//              GO TO  2210-EDIT-ACCOUNT-EXIT                                     \n" +
            "//           END-IF                                                               \n" +
            "//      *                                                                         \n" +
            "//      *    Not numeric                                                          \n" +
            "//      *    Not 11 characters                                                    \n" +
            "//           IF CC-ACCT-ID  IS NOT NUMERIC \n" +
            "//           OR CC-ACCT-ID  EQUAL ZEROES                                          \n" +
            "//              SET INPUT-ERROR TO TRUE                                           \n" +
            "//              SET FLG-ACCTFILTER-NOT-OK TO TRUE                                 \n" +
            "//              IF WS-RETURN-MSG-OFF                                              \n" +
            "//                MOVE                                                            \n" +
            "//              'Account Filter must  be a non-zero 11 digit number'      00\n" +
            "//                              TO WS-RETURN-MSG                                  \n" +
            "//              END-IF                                                            \n" +
            "//              MOVE ZERO       TO CDEMO-ACCT-ID                                  \n" +
            "//              GO TO 2210-EDIT-ACCOUNT-EXIT                                      \n" +
            "//           ELSE                                                                 \n" +
            "//              MOVE CC-ACCT-ID TO CDEMO-ACCT-ID                                  \n" +
            "//              SET FLG-ACCTFILTER-ISVALID TO TRUE                                \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void EditAccount(){\n" +
            "\n" +
            "//      flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//      //     Not supplied                                                         \n" +
            "\n" +
            "//      if (getCcAcctId().equals(null)\n" +
            "\n" +
            "//          || getCcAcctId().equals(\" \"))    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterBlank = = true;\n" +
            "\n" +
            "//          if (getWsReturnMsgOff())        {\n" +
            "\n" +
            "//              wsPromptForAcct = = true;        }\n" +
            "\n" +
            "//          setCdemoAcctId(0);\n" +
            "\n" +
            "//          /* TODO Untranslated GoTo found. \" Go TO EditAccountExit\" Ln:1609 */    }\n" +
            "\n" +
            "//      //                                                                          \n" +
            "\n" +
            "//      //     Not numeric                                                          \n" +
            "\n" +
            "//      //     Not 11 characters                                                    \n" +
            "\n" +
            "//      if (!Int32.TryParse(getCcAcctId(), out testInt)\n" +
            "\n" +
            "//          || getCcAcctId().equals(0))    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//          if (getWsReturnMsgOff())        {\n" +
            "\n" +
            "//              setWsReturnMsg(\"Account Filter must  be a non-zero 11 digit number\");        }\n" +
            "\n" +
            "//          setCdemoAcctId(0);\n" +
            "\n" +
            "//          /* TODO Untranslated GoTo found. \" Go TO EditAccountExit\" Ln:1624 */    }\n" +
            "\n" +
            "//      else    {\n" +
            "\n" +
            "//          setCdemoAcctId(getCcAcctId());    } }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       2210-EDIT-ACCOUNT-EXIT.                                                  \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void EditAccountExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9000-READ-ACCT.                                                          \n" +
            "//                                                                                \n" +
            "//           SET  WS-NO-INFO-MESSAGE  TO TRUE\n" +
            "//           \n" +
            "//           MOVE CDEMO-ACCT-ID TO WS-CARD-RID-ACCT-ID                            \n" +
            "//                                                                                \n" +
            "//           PERFORM 9200-GETCARDXREF-BYACCT                                      \n" +
            "//              THRU 9200-GETCARDXREF-BYACCT-EXIT                                 \n" +
            "//                                                                                \n" +
            "//      *    IF DID-NOT-FIND-ACCT-IN-CARDXREF                                     \n" +
            "//           IF FLG-ACCTFILTER-NOT-OK                                             \n" +
            "//              GO TO 9000-READ-ACCT-EXIT                                         \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           PERFORM 9300-GETACCTDATA-BYACCT                                      \n" +
            "//              THRU 9300-GETACCTDATA-BYACCT-EXIT                                 \n" +
            "//                                                                                \n" +
            "//           IF DID-NOT-FIND-ACCT-IN-ACCTDAT                                      \n" +
            "//              GO TO 9000-READ-ACCT-EXIT                                         \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           MOVE CDEMO-CUST-ID TO WS-CARD-RID-CUST-ID                            \n" +
            "//                                                                                \n" +
            "//           PERFORM 9400-GETCUSTDATA-BYCUST                                      \n" +
            "//              THRU 9400-GETCUSTDATA-BYCUST-EXIT                                 \n" +
            "//                                                                                \n" +
            "//           IF DID-NOT-FIND-CUST-IN-CUSTDAT                                      \n" +
            "//              GO TO 9000-READ-ACCT-EXIT                                         \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ReadAcct(){\n" +
            "\n" +
            "//      wsNoInfoMessage = = true;\n" +
            "\n" +
            "//      setWsCardRidAcctId(getCdemoAcctId());\n" +
            "\n" +
            "//      GetcardxrefByacct(); /*To:GetcardxrefByacctExit*/\n" +
            "\n" +
            "//      //     IF DID-NOT-FIND-ACCT-IN-CARDXREF                                     \n" +
            "\n" +
            "//      if (getFlgAcctfilterNotOk())    {\n" +
            "\n" +
            "//          /* TODO Untranslated GoTo found. \" Go TO ReadAcctExit\" Ln:1646 */    }\n" +
            "\n" +
            "//      GetacctdataByacct(); /*To:GetacctdataByacctExit*/\n" +
            "\n" +
            "//      if (getDidNotFindAcctInAcctdat())    {\n" +
            "\n" +
            "//          /* TODO Untranslated GoTo found. \" Go TO ReadAcctExit\" Ln:1653 */    }\n" +
            "\n" +
            "//      setWsCardRidCustId(getCdemoCustId());\n" +
            "\n" +
            "//      GetcustdataBycust(); /*To:GetcustdataBycustExit*/\n" +
            "\n" +
            "//      if (getDidNotFindCustInCustdat())    {    } }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9000-READ-ACCT-EXIT.                                                     \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void ReadAcctExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9200-GETCARDXREF-BYACCT.                                                 \n" +
            "//                                                                                \n" +
            "//      *    Read the Card file. Access via alternate index ACCTID                \n" +
            "//      *                                                                         \n" +
            "//           EXEC CICS READ                                                       \n" +
            "//                DATASET   (LIT-CARDXREFNAME-ACCT-PATH)                          \n" +
            "//                RIDFLD    (WS-CARD-RID-ACCT-ID-X)                               \n" +
            "//                KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                     \n" +
            "//                INTO      (CARD-XREF-RECORD)                                    \n" +
            "//                LENGTH    (LENGTH OF CARD-XREF-RECORD)                          \n" +
            "//                RESP      (WS-RESP-CD)                                          \n" +
            "//                RESP2     (WS-REAS-CD)                                          \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EVALUATE WS-RESP-CD                                                  \n" +
            "//               WHEN DFHRESP(NORMAL)                                             \n" +
            "//                  MOVE XREF-CUST-ID               TO CDEMO-CUST-ID              \n" +
            "//                  MOVE XREF-CARD-NUM              TO CDEMO-CARD-NUM             \n" +
            "//               WHEN DFHRESP(NOTFND)                                             \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-ACCTFILTER-NOT-OK       TO TRUE                       \n" +
            "//                  IF WS-RETURN-MSG-OFF                                          \n" +
            "//                    MOVE WS-RESP-CD               TO ERROR-RESP                 \n" +
            "//                    MOVE WS-REAS-CD               TO ERROR-RESP2                \n" +
            "//                    STRING                                                      \n" +
            "//                    'Account:'                                                  \n" +
            "//                     WS-CARD-RID-ACCT-ID-X                                      \n" +
            "//                    ' not found in'                                             \n" +
            "//                    ' Cross ref file.  Resp:'                                   \n" +
            "//                    ERROR-RESP                                                  \n" +
            "//                    ' Reas:'                                                    \n" +
            "//                    ERROR-RESP2                                                 \n" +
            "//                    DELIMITED BY SIZE                                           \n" +
            "//                    INTO WS-RETURN-MSG                                          \n" +
            "//                    END-STRING                                                  \n" +
            "//                  END-IF                                                        \n" +
            "//               WHEN OTHER                                                       \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-ACCTFILTER-NOT-OK                TO TRUE              \n" +
            "//                  MOVE 'READ'                     TO ERROR-OPNAME               \n" +
            "//                  MOVE LIT-CARDXREFNAME-ACCT-PATH TO ERROR-FILE                 \n" +
            "//                  MOVE WS-RESP-CD                 TO ERROR-RESP                 \n" +
            "//                  MOVE WS-REAS-CD                 TO ERROR-RESP2                \n" +
            "//                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG              \n" +
            "//      *                                              WS-LONG-MSG                \n" +
            "//      *          PERFORM SEND-LONG-TEXT                                         \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetcardxrefByacct()\n" +
            "\n" +
            "//  //     Read the Card file. Access via alternate index ACCTID                \n" +
            "\n" +
            "//  //                                                                          {\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1675        EXEC CICS READ                                                                       DATASET   (LIT-CARDXREFNAME-ACCT-PATH)                                          RIDFLD    (WS-CARD-RID-ACCT-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                                     INTO      (CARD-XREF-RECORD)                                                    LENGTH    (LENGTH OF CARD-XREF-RECORD)                                          RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */  \n" +
            "\n" +
            "//      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          setCdemoCustId(getXrefCustId());\n" +
            "\n" +
            "//          setCdemoCardNum(getXrefCardNum());    }    \n" +
            "\n" +
            "//      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//          if (getWsReturnMsgOff())        {\n" +
            "\n" +
            "//              setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//              setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//              setWsReturnMsg(\"Account:\" + \" Cross ref file.  Resp:\".equals(getWsCardRidAcctIdX())\n" +
            "\n" +
            "//                  + getErrorResp().equals(getErrorResp2()));        }    }    \n" +
            "\n" +
            "//      else if (default:)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//          setErrorOpname(\"READ\");\n" +
            "\n" +
            "//          setErrorFile(getLitCardxrefnameAcctPath());\n" +
            "\n" +
            "//          setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//          setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//          setWsReturnMsg(getWsFileErrorMessage());    }    \n" +
            "\n" +
            "//      //                                               WS-LONG-MSG                         }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9200-GETCARDXREF-BYACCT-EXIT.                                            \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetcardxrefByacctExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9300-GETACCTDATA-BYACCT.                                                 \n" +
            "//                                                                                \n" +
            "//           EXEC CICS READ                                                       \n" +
            "//                DATASET   (LIT-ACCTFILENAME)                                    \n" +
            "//                RIDFLD    (WS-CARD-RID-ACCT-ID-X)                               \n" +
            "//                KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                     \n" +
            "//                INTO      (ACCOUNT-RECORD)                                      \n" +
            "//                LENGTH    (LENGTH OF ACCOUNT-RECORD)                            \n" +
            "//                RESP      (WS-RESP-CD)                                          \n" +
            "//                RESP2     (WS-REAS-CD)                                          \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EVALUATE WS-RESP-CD                                                  \n" +
            "//               WHEN DFHRESP(NORMAL)                                             \n" +
            "//                  SET FOUND-ACCT-IN-MASTER        TO TRUE                       \n" +
            "//               WHEN DFHRESP(NOTFND)                                             \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-ACCTFILTER-NOT-OK       TO TRUE                       \n" +
            "//      *           SET DID-NOT-FIND-ACCT-IN-ACCTDAT TO TRUE                      \n" +
            "//                  IF WS-RETURN-MSG-OFF                                          \n" +
            "//                    MOVE WS-RESP-CD               TO ERROR-RESP                 \n" +
            "//                    MOVE WS-REAS-CD               TO ERROR-RESP2                \n" +
            "//                    STRING                                                      \n" +
            "//                    'Account:'                                                  \n" +
            "//                     WS-CARD-RID-ACCT-ID-X                                      \n" +
            "//                    ' not found in'                                             \n" +
            "//                    ' Acct Master file.Resp:'                                   \n" +
            "//                    ERROR-RESP                                                  \n" +
            "//                    ' Reas:'                                                    \n" +
            "//                    ERROR-RESP2                                                 \n" +
            "//                    DELIMITED BY SIZE                                           \n" +
            "//                    INTO WS-RETURN-MSG                                          \n" +
            "//                    END-STRING                                                  \n" +
            "//                  END-IF                                                        \n" +
            "//      *                                                                         \n" +
            "//               WHEN OTHER                                                       \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-ACCTFILTER-NOT-OK                TO TRUE              \n" +
            "//                  MOVE 'READ'                     TO ERROR-OPNAME               \n" +
            "//                  MOVE LIT-ACCTFILENAME           TO ERROR-FILE                 \n" +
            "//                  MOVE WS-RESP-CD                 TO ERROR-RESP                 \n" +
            "//                  MOVE WS-REAS-CD                 TO ERROR-RESP2                \n" +
            "//                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG              \n" +
            "//      *                                              WS-LONG-MSG                \n" +
            "//      *           PERFORM SEND-LONG-TEXT                                        \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetacctdataByacct(){\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1724        EXEC CICS READ                                                                       DATASET   (LIT-ACCTFILENAME)                                                    RIDFLD    (WS-CARD-RID-ACCT-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                                     INTO      (ACCOUNT-RECORD)                                                      LENGTH    (LENGTH OF ACCOUNT-RECORD)                                            RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */  \n" +
            "\n" +
            "//      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          foundAcctInMaster = = true;    }    \n" +
            "\n" +
            "//      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//          //            SET DID-NOT-FIND-ACCT-IN-ACCTDAT TO TRUE                      \n" +
            "\n" +
            "//          if (getWsReturnMsgOff())        {\n" +
            "\n" +
            "//              setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//              setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//              setWsReturnMsg(\"Account:\" + \" Acct Master file.Resp:\".equals(getWsCardRidAcctIdX())\n" +
            "\n" +
            "//                  + getErrorResp().equals(getErrorResp2()));        }    }    \n" +
            "\n" +
            "//      //                                                                          \n" +
            "\n" +
            "//      else if (default:)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgAcctfilterNotOk = = true;\n" +
            "\n" +
            "//          setErrorOpname(\"READ\");\n" +
            "\n" +
            "//          setErrorFile(getLitAcctfilename());\n" +
            "\n" +
            "//          setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//          setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//          setWsReturnMsg(getWsFileErrorMessage());    }    \n" +
            "\n" +
            "//      //                                               WS-LONG-MSG                         }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9300-GETACCTDATA-BYACCT-EXIT.                                            \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetacctdataByacctExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9400-GETCUSTDATA-BYCUST.                                                 \n" +
            "//           EXEC CICS READ                                                       \n" +
            "//                DATASET   (LIT-CUSTFILENAME)                                    \n" +
            "//                RIDFLD    (WS-CARD-RID-CUST-ID-X)                               \n" +
            "//                KEYLENGTH (LENGTH OF WS-CARD-RID-CUST-ID-X)                     \n" +
            "//                INTO      (CUSTOMER-RECORD)                                     \n" +
            "//                LENGTH    (LENGTH OF CUSTOMER-RECORD)                           \n" +
            "//                RESP      (WS-RESP-CD)                                          \n" +
            "//                RESP2     (WS-REAS-CD)                                          \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EVALUATE WS-RESP-CD                                                  \n" +
            "//               WHEN DFHRESP(NORMAL)                                             \n" +
            "//                  SET FOUND-CUST-IN-MASTER        TO TRUE                       \n" +
            "//               WHEN DFHRESP(NOTFND)                                             \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-CUSTFILTER-NOT-OK       TO TRUE                       \n" +
            "//      *           SET DID-NOT-FIND-CUST-IN-CUSTDAT TO TRUE                      \n" +
            "//                  MOVE WS-RESP-CD               TO ERROR-RESP                   \n" +
            "//                  MOVE WS-REAS-CD               TO ERROR-RESP2                  \n" +
            "//                  IF WS-RETURN-MSG-OFF                                          \n" +
            "//                    STRING                                                      \n" +
            "//                    'CustId:'                                                   \n" +
            "//                     WS-CARD-RID-CUST-ID-X                                      \n" +
            "//                    ' not found'                                                \n" +
            "//                    ' in customer master.Resp: '                                \n" +
            "//                    ERROR-RESP                                                  \n" +
            "//                    ' REAS:'                                                    \n" +
            "//                    ERROR-RESP2                                                 \n" +
            "//                    DELIMITED BY SIZE                                           \n" +
            "//                    INTO WS-RETURN-MSG                                          \n" +
            "//                    END-STRING                                                  \n" +
            "//                  END-IF                                                        \n" +
            "//               WHEN OTHER                                                       \n" +
            "//                  SET INPUT-ERROR                 TO TRUE                       \n" +
            "//                  SET FLG-CUSTFILTER-NOT-OK                TO TRUE              \n" +
            "//                  MOVE 'READ'                     TO ERROR-OPNAME               \n" +
            "//                  MOVE LIT-CUSTFILENAME           TO ERROR-FILE                 \n" +
            "//                  MOVE WS-RESP-CD                 TO ERROR-RESP                 \n" +
            "//                  MOVE WS-REAS-CD                 TO ERROR-RESP2                \n" +
            "//                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG              \n" +
            "//      *                                              WS-LONG-MSG                \n" +
            "//      *           PERFORM SEND-LONG-TEXT                                        \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetcustdataBycust(){\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1774        EXEC CICS READ                                                                       DATASET   (LIT-CUSTFILENAME)                                                    RIDFLD    (WS-CARD-RID-CUST-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-CUST-ID-X)                                     INTO      (CUSTOMER-RECORD)                                                     LENGTH    (LENGTH OF CUSTOMER-RECORD)                                           RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */  \n" +
            "\n" +
            "//      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          foundCustInMaster = = true;    }    \n" +
            "\n" +
            "//      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgCustfilterNotOk = = true;\n" +
            "\n" +
            "//          //            SET DID-NOT-FIND-CUST-IN-CUSTDAT TO TRUE                      \n" +
            "\n" +
            "//          setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//          setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//          if (getWsReturnMsgOff())        {\n" +
            "\n" +
            "//              setWsReturnMsg(\"CustId:\" + \" in customer master.Resp:\".equals(getWsCardRidCustIdX())\n" +
            "\n" +
            "//                  + getErrorResp().equals(getErrorResp2()));        }    }    \n" +
            "\n" +
            "//      else if (default:)    {\n" +
            "\n" +
            "//          inputError = = true;\n" +
            "\n" +
            "//          flgCustfilterNotOk = = true;\n" +
            "\n" +
            "//          setErrorOpname(\"READ\");\n" +
            "\n" +
            "//          setErrorFile(getLitCustfilename());\n" +
            "\n" +
            "//          setErrorResp(getWsRespCd());\n" +
            "\n" +
            "//          setErrorResp2(getWsReasCd());\n" +
            "\n" +
            "//          setWsReturnMsg(getWsFileErrorMessage());    }    \n" +
            "\n" +
            "//      //                                               WS-LONG-MSG                         }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       9400-GETCUSTDATA-BYCUST-EXIT.                                            \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void GetcustdataBycustExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       SEND-PLAIN-TEXT.                                                         \n" +
            "//           EXEC CICS SEND TEXT                                                  \n" +
            "//                     FROM(WS-RETURN-MSG)                                        \n" +
            "//                     LENGTH(LENGTH OF WS-RETURN-MSG)                            \n" +
            "//                     ERASE                                                      \n" +
            "//                     FREEKB                                                     \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EXEC CICS RETURN                                                     \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendPlainText(){\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1826        EXEC CICS SEND TEXT                                                                       FROM(WS-RETURN-MSG)                                                             LENGTH(LENGTH OF WS-RETURN-MSG)                                                 ERASE                                                                           FREEKB                                                                END-EXEC    */          EXEC CICS RETURN                                                                END-EXEC    */   }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       SEND-PLAIN-TEXT-EXIT.                                                    \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendPlainTextExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       SEND-LONG-TEXT.                                                          \n" +
            "//           EXEC CICS SEND TEXT                                                  \n" +
            "//                     FROM(WS-LONG-MSG)                                          \n" +
            "//                     LENGTH(LENGTH OF WS-LONG-MSG)                              \n" +
            "//                     ERASE                                                      \n" +
            "//                     FREEKB                                                     \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EXEC CICS RETURN                                                     \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendLongText(){\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1845        EXEC CICS SEND TEXT                                                                       FROM(WS-LONG-MSG)                                                               LENGTH(LENGTH OF WS-LONG-MSG)                                                   ERASE                                                                           FREEKB                                                                END-EXEC    */          EXEC CICS RETURN                                                                END-EXEC    */   }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       SEND-LONG-TEXT-EXIT.                                                     \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void SendLongTextExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       YYYY-STORE-PFKEY.                                                        \n" +
            "//      *****************************************************************         \n" +
            "//      * Map AID to PFKey in COMMON Area                                         \n" +
            "//      *****************************************************************         \n" +
            "//           EVALUATE TRUE                                                        \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHENTER                                   \n" +
            "//               SET CCARD-AID-ENTER TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHCLEAR                                   \n" +
            "//               SET CCARD-AID-CLEAR TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPA1                                     \n" +
            "//               SET CCARD-AID-PA1  TO TRUE                                       \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPA2                                     \n" +
            "//               SET CCARD-AID-PA2  TO TRUE                                       \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF1                                     \n" +
            "//               SET CCARD-AID-PFK01 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF2                                     \n" +
            "//               SET CCARD-AID-PFK02 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF3                                     \n" +
            "//               SET CCARD-AID-PFK03 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF4                                     \n" +
            "//               SET CCARD-AID-PFK04 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF5                                     \n" +
            "//               SET CCARD-AID-PFK05 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF6                                     \n" +
            "//               SET CCARD-AID-PFK06 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF7                                     \n" +
            "//               SET CCARD-AID-PFK07 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF8                                     \n" +
            "//               SET CCARD-AID-PFK08 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF9                                     \n" +
            "//               SET CCARD-AID-PFK09 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF10                                    \n" +
            "//               SET CCARD-AID-PFK10 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF11                                    \n" +
            "//               SET CCARD-AID-PFK11 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF12                                    \n" +
            "//               SET CCARD-AID-PFK12 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF13                                    \n" +
            "//               SET CCARD-AID-PFK01 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF14                                    \n" +
            "//               SET CCARD-AID-PFK02 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF15                                    \n" +
            "//               SET CCARD-AID-PFK03 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF16                                    \n" +
            "//               SET CCARD-AID-PFK04 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF17                                    \n" +
            "//               SET CCARD-AID-PFK05 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF18                                    \n" +
            "//               SET CCARD-AID-PFK06 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF19                                    \n" +
            "//               SET CCARD-AID-PFK07 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF20                                    \n" +
            "//               SET CCARD-AID-PFK08 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF21                                    \n" +
            "//               SET CCARD-AID-PFK09 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF22                                    \n" +
            "//               SET CCARD-AID-PFK10 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF23                                    \n" +
            "//               SET CCARD-AID-PFK11 TO TRUE                                      \n" +
            "//             WHEN EIBAID IS EQUAL TO DFHPF24                                    \n" +
            "//               SET CCARD-AID-PFK12 TO TRUE                                      \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void YyyyStorePfkey()\n" +
            "\n" +
            "//  // ****************************************************************         \n" +
            "\n" +
            "//  //  Map AID to PFKey in COMMON Area                                         \n" +
            "\n" +
            "//  // ****************************************************************         {\n" +
            "\n" +
            "//      if (getEibaid().equals(getDfhenter()))    {\n" +
            "\n" +
            "//          ccardAidEnter = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhclear()))    {\n" +
            "\n" +
            "//          ccardAidClear = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpa1()))    {\n" +
            "\n" +
            "//          ccardAidPa1 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpa2()))    {\n" +
            "\n" +
            "//          ccardAidPa2 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf1()))    {\n" +
            "\n" +
            "//          ccardAidPfk01 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf2()))    {\n" +
            "\n" +
            "//          ccardAidPfk02 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf3()))    {\n" +
            "\n" +
            "//          ccardAidPfk03 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf4()))    {\n" +
            "\n" +
            "//          ccardAidPfk04 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf5()))    {\n" +
            "\n" +
            "//          ccardAidPfk05 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf6()))    {\n" +
            "\n" +
            "//          ccardAidPfk06 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf7()))    {\n" +
            "\n" +
            "//          ccardAidPfk07 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf8()))    {\n" +
            "\n" +
            "//          ccardAidPfk08 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf9()))    {\n" +
            "\n" +
            "//          ccardAidPfk09 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf10()))    {\n" +
            "\n" +
            "//          ccardAidPfk10 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf11()))    {\n" +
            "\n" +
            "//          ccardAidPfk11 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf12()))    {\n" +
            "\n" +
            "//          ccardAidPfk12 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf13()))    {\n" +
            "\n" +
            "//          ccardAidPfk01 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf14()))    {\n" +
            "\n" +
            "//          ccardAidPfk02 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf15()))    {\n" +
            "\n" +
            "//          ccardAidPfk03 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf16()))    {\n" +
            "\n" +
            "//          ccardAidPfk04 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf17()))    {\n" +
            "\n" +
            "//          ccardAidPfk05 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf18()))    {\n" +
            "\n" +
            "//          ccardAidPfk06 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf19()))    {\n" +
            "\n" +
            "//          ccardAidPfk07 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf20()))    {\n" +
            "\n" +
            "//          ccardAidPfk08 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf21()))    {\n" +
            "\n" +
            "//          ccardAidPfk09 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf22()))    {\n" +
            "\n" +
            "//          ccardAidPfk10 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf23()))    {\n" +
            "\n" +
            "//          ccardAidPfk11 = = true;    }    \n" +
            "\n" +
            "//      else if (getEibaid().equals(getDfhpf24()))    {    }     }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       YYYY-STORE-PFKEY-EXIT.                                                   \n" +
            "//           EXIT                                                                 \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void YyyyStorePfkeyExit(){}\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented legacy code for referenece :  Start\n" +
            "//       ABEND-ROUTINE.                                                           \n" +
            "//                                                                                \n" +
            "//           IF ABEND-MSG EQUAL LOW-VALUES                                        \n" +
            "//              MOVE 'UNEXPECTED ABEND OCCURRED.' TO ABEND-MSG                    \n" +
            "//           END-IF                                                               \n" +
            "//                                                                                \n" +
            "//           MOVE LIT-THISPGM       TO ABEND-CULPRIT                              \n" +
            "//                                                                                \n" +
            "//           EXEC CICS SEND                                                       \n" +
            "//                            FROM (ABEND-DATA)                                   \n" +
            "//                            LENGTH(LENGTH OF ABEND-DATA)                        \n" +
            "//                            NOHANDLE                                            \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EXEC CICS HANDLE ABEND                                               \n" +
            "//                CANCEL                                                          \n" +
            "//           END-EXEC                                                             \n" +
            "//                                                                                \n" +
            "//           EXEC CICS ABEND                                                      \n" +
            "//                ABCODE('9999')                                                  \n" +
            "//           END-EXEC                                                             \n" +
            "// Commented Legacy code for referenece:  End\n" +
            "//////////////////////////////////////////////\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  Start\n" +
            "//  /// <summary>/// Description for Method/// </summary>/// <param name=\"param\">param 1</param>/// <returns></returns>public void AbendRoutine(){\n" +
            "\n" +
            "//      if (getAbendMsg().equals(null))    {\n" +
            "\n" +
            "//          setAbendMsg(\"UNEXPECTED ABEND OCCURRED.\");    }\n" +
            "\n" +
            "//      setAbendCulprit(getLitThispgm());\n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1959        EXEC CICS SEND                                                                                   FROM (ABEND-DATA)                                                               LENGTH(LENGTH OF ABEND-DATA)                                                    NOHANDLE                                                       END-EXEC    */  \n" +
            "\n" +
            "//      /* TODO Exec CICS statement not yet translated.  Ln:1965        EXEC CICS HANDLE ABEND                                                               CANCEL                                                                     END-EXEC    */          EXEC CICS ABEND                                                                      ABCODE('9999')                                                             END-EXEC    */   }\n" +
            "\n" +
            "//////////////////////////////////////////////\n" +
            "// Commented translated  :  end\n" +
            "\n" +
            "\n" +
            "		\n";

        return ResponseEntity
            .created(new URI("/api/COACTVWC/method1"))
            .headers(HeaderUtil.createEntityCreationAlert("applicationName", true, "", "COACTVWC"))
            .body(result);
    }
    // Transplied Code from legacy- Start

    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       0000-MAIN.
    // //
    // //           EXEC CICS HANDLE ABEND
    // //                     LABEL(ABEND-ROUTINE)
    // //           END-EXEC
    // //
    // //           INITIALIZE CC-WORK-AREA
    // //                      WS-MISC-STORAGE
    // //                      WS-COMMAREA
    // //      *****************************************************************
    // //      * Store our context
    // //      *****************************************************************
    // //           MOVE LIT-THISTRANID       TO WS-TRANID
    // //      *****************************************************************
    // //      * Ensure error message is cleared                               *
    // //      *****************************************************************
    // //           SET WS-RETURN-MSG-OFF  TO TRUE
    // //      *****************************************************************
    // //      * Store passed data if  any                *
    // //      *****************************************************************
    // //           IF EIBCALEN IS EQUAL TO 0
    // //               OR (CDEMO-FROM-PROGRAM = LIT-MENUPGM
    // //               AND NOT CDEMO-PGM-REENTER)
    // //              INITIALIZE CARDDEMO-COMMAREA
    // //                         WS-THIS-PROGCOMMAREA
    // //           ELSE
    // //              MOVE DFHCOMMAREA (1:LENGTH OF CARDDEMO-COMMAREA)  TO
    // //                                CARDDEMO-COMMAREA
    // //              MOVE DFHCOMMAREA(LENGTH OF CARDDEMO-COMMAREA + 1:
    // //                               LENGTH OF WS-THIS-PROGCOMMAREA ) TO
    // //                                WS-THIS-PROGCOMMAREA
    // //           END-IF
    // //
    // //      *****************************************************************
    // //      * Remap PFkeys as needed.
    // //      * Store the Mapped PF Key
    // //      *****************************************************************
    // //           PERFORM YYYY-STORE-PFKEY
    // //              THRU YYYY-STORE-PFKEY-EXIT
    // //      *****************************************************************
    // //      * Check the AID to see if its valid at this point               *
    // //      * F3 - Exit
    // //      * Enter show screen again
    // //      *****************************************************************
    // //           SET PFK-INVALID TO TRUE
    // //           IF CCARD-AID-ENTER OR
    // //              CCARD-AID-PFK03
    // //              SET PFK-VALID TO TRUE
    // //           END-IF
    // //
    // //           IF PFK-INVALID
    // //              SET CCARD-AID-ENTER TO TRUE
    // //           END-IF
    // //
    // //      *****************************************************************
    // //      * Decide what to do based on inputs received
    // //      *****************************************************************
    // //      *****************************************************************
    // //      *****************************************************************
    // //      * Decide what to do based on inputs received
    // //      *****************************************************************
    // //           EVALUATE TRUE
    // //              WHEN CCARD-AID-PFK03
    // //      ******************************************************************
    // //      *            XCTL TO CALLING PROGRAM OR MAIN MENU
    // //      ******************************************************************
    // //                   IF CDEMO-FROM-TRANID    EQUAL LOW-VALUES
    // //                   OR CDEMO-FROM-TRANID    EQUAL SPACES
    // //                      MOVE LIT-MENUTRANID  TO CDEMO-TO-TRANID
    // //                   ELSE
    // //                      MOVE CDEMO-FROM-TRANID  TO CDEMO-TO-TRANID
    // //                   END-IF
    // //                   IF CDEMO-FROM-PROGRAM   EQUAL LOW-VALUES
    // //                   OR CDEMO-FROM-PROGRAM   EQUAL SPACES
    // //                      MOVE LIT-MENUPGM     TO CDEMO-TO-PROGRAM
    // //                   ELSE
    // //                      MOVE CDEMO-FROM-PROGRAM TO CDEMO-TO-PROGRAM
    // //                   END-IF
    // //
    // //                   MOVE LIT-THISTRANID     TO CDEMO-FROM-TRANID
    // //                   MOVE LIT-THISPGM        TO CDEMO-FROM-PROGRAM
    // //
    // //                   SET  CDEMO-USRTYP-USER  TO TRUE
    // //                   SET  CDEMO-PGM-ENTER    TO TRUE
    // //                   MOVE LIT-THISMAPSET     TO CDEMO-LAST-MAPSET
    // //                   MOVE LIT-THISMAP        TO CDEMO-LAST-MAP
    // //      *
    // //                   EXEC CICS XCTL
    // //                             PROGRAM (CDEMO-TO-PROGRAM)
    // //                             COMMAREA(CARDDEMO-COMMAREA)
    // //                   END-EXEC
    // //              WHEN CDEMO-PGM-ENTER
    // //      ******************************************************************
    // //      *            COMING FROM SOME OTHER CONTEXT
    // //      *            SELECTION CRITERIA TO BE GATHERED
    // //      ******************************************************************
    // //                   PERFORM 1000-SEND-MAP THRU
    // //                           1000-SEND-MAP-EXIT
    // //                   GO TO COMMON-RETURN
    // //              WHEN CDEMO-PGM-REENTER
    // //                   PERFORM 2000-PROCESS-INPUTS
    // //                      THRU 2000-PROCESS-INPUTS-EXIT
    // //                   IF INPUT-ERROR
    // //                      PERFORM 1000-SEND-MAP
    // //                         THRU 1000-SEND-MAP-EXIT
    // //                      GO TO COMMON-RETURN
    // //                   ELSE
    // //                      PERFORM 9000-READ-ACCT
    // //                         THRU 9000-READ-ACCT-EXIT
    // //                      PERFORM 1000-SEND-MAP
    // //                         THRU 1000-SEND-MAP-EXIT
    // //                      GO TO COMMON-RETURN
    // //                   END-IF
    // //             WHEN OTHER
    // //                   MOVE LIT-THISPGM    TO ABEND-CULPRIT
    // //                   MOVE '0001'         TO ABEND-CODE
    // //                   MOVE SPACES         TO ABEND-REASON
    // //                   MOVE 'UNEXPECTED DATA SCENARIO'
    // //                                       TO WS-RETURN-MSG
    // //                   PERFORM SEND-PLAIN-TEXT
    // //                      THRU SEND-PLAIN-TEXT-EXIT
    // //           END-EVALUATE
    // //
    // //      * If we had an error setup error message that slipped through
    // //      * Display and return
    // //           IF INPUT-ERROR
    // //              MOVE WS-RETURN-MSG  TO CCARD-ERROR-MSG
    // //              PERFORM 1000-SEND-MAP
    // //                 THRU 1000-SEND-MAP-EXIT
    // //              GO TO COMMON-RETURN
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void Main(){
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1212        EXEC CICS HANDLE ABEND                                                                    LABEL(ABEND-ROUTINE)                                                  END-EXEC    */
    //
    // //      /* TODO Initialize statement not yet translated.  Ln:1216        INITIALIZE CC-WORK-AREA    */
    //
    // //      // ****************************************************************
    //
    // //      //  Store our context
    //
    // //      // ****************************************************************
    //
    // //      setWsTranid(getLitThistranid());
    //
    // //      // ****************************************************************
    //
    // //      //  Ensure error message is cleared                               *
    //
    // //      // ****************************************************************
    //
    // //      wsReturnMsgOff = = true;
    //
    // //      // ****************************************************************             //  Store passed data if  any                *                                  // ****************************************************************
    //
    // //      if (getEibcalen().equals(0)
    //
    // //          || !getEibcalen().equals((getCdemoFromProgram().equals(getLitMenupgm())        && !getCdemoPgmReenter())))    {
    //
    // //          /* TODO Initialize statement not yet translated.  Ln:1233            INITIALIZE CARDDEMO-COMMAREA        */     }
    //
    // //      else    {
    //
    // //          setCarddemoCommarea(getDfhcommarea().Substring(1, carddemoCommarea.Length()));
    //
    // //          setWsThisProgcommarea(getDfhcommarea().Substring(carddemoCommarea.Length()
    //
    // //              + 1, wsThisProgcommarea.Length()));    }
    //
    // //      // ****************************************************************
    //
    // //      //  Remap PFkeys as needed.
    //
    // //      //  Store the Mapped PF Key
    //
    // //      // ****************************************************************
    //
    // //      YyyyStorePfkey(); /*To:YyyyStorePfkeyExit*/
    //
    // //      // ****************************************************************
    //
    // //      //  Check the AID to see if its valid at this point               *
    //
    // //      //  F3 - Exit
    //
    // //      //  Enter show screen again
    //
    // //      // ****************************************************************
    //
    // //      pfkInvalid = = true;
    //
    // //      if (getCcardAidEnter()
    //
    // //          || getCcardAidPfk03())    {
    //
    // //          pfkValid = = true;    }
    //
    // //      if (getPfkInvalid())    {
    //
    // //          ccardAidEnter = = true;    }
    //
    // //      // ****************************************************************
    //
    // //      //  Decide what to do based on inputs received
    //
    // //      // ****************************************************************
    //
    // //      // ****************************************************************
    //
    // //      // ****************************************************************
    //
    // //      //  Decide what to do based on inputs received
    //
    // //      // ****************************************************************
    //
    // //      if (getCcardAidPfk03())
    //
    // //      // *****************************************************************
    //
    // //      //             XCTL TO CALLING PROGRAM OR MAIN MENU
    //
    // //      // *****************************************************************            {
    //
    // //          if (getCdemoFromTranid().equals(null)
    //
    // //              || getCdemoFromTranid().equals(" "))        {
    //
    // //              setCdemoToTranid(getLitMenutranid());        }
    //
    // //          else        {
    //
    // //              setCdemoToTranid(getCdemoFromTranid());        }
    //
    // //          if (getCdemoFromProgram().equals(null)
    //
    // //              || getCdemoFromProgram().equals(" "))        {
    //
    // //              setCdemoToProgram(getLitMenupgm());        }
    //
    // //          else        {
    //
    // //              setCdemoToProgram(getCdemoFromProgram());        }
    //
    // //          setCdemoFromTranid(getLitThistranid());
    //
    // //          setCdemoFromProgram(getLitThispgm());
    //
    // //          cdemoUsrtypUser = = true;
    //
    // //          cdemoPgmEnter = = true;
    //
    // //          setCdemoLastMapset(getLitThismapset());
    //
    // //          setCdemoLastMap(getLitThismap());
    //
    // //          //
    //
    // //          /* TODO Exec CICS statement not yet translated.  Ln:1297            EXEC CICS XCTL                                                                            PROGRAM (CDEMO-TO-PROGRAM)                                                      COMMAREA(CARDDEMO-COMMAREA)                                           END-EXEC        */      }
    //
    // //      else if (getCdemoPgmEnter())
    //
    // //      // *****************************************************************
    //
    // //      //             COMING FROM SOME OTHER CONTEXT
    //
    // //      //             SELECTION CRITERIA TO BE GATHERED
    //
    // //      // *****************************************************************            {
    //
    // //          SendMap(); /*To:SendMapExit*/
    //
    // //          /* TODO Untranslated GoTo found. " Go TO CommonReturn" Ln:1308 */    }
    //
    // //      else if (getCdemoPgmReenter())    {
    //
    // //          ProcessInputs(); /*To:ProcessInputsExit*/
    //
    // //          if (getInputError())        {
    //
    // //              SendMap(); /*To:SendMapExit*/
    //
    // //              /* TODO Untranslated GoTo found. " Go TO CommonReturn" Ln:1315 */        }
    //
    // //          else        {
    //
    // //              ReadAcct(); /*To:ReadAcctExit*/
    //
    // //              SendMap(); /*To:SendMapExit*/
    //
    // //              /* TODO Untranslated GoTo found. " Go TO CommonReturn" Ln:1321 */        }    }
    //
    // //      else if (default:)    {
    //
    // //          setAbendCulprit(getLitThispgm());
    //
    // //          setAbendCode("0001");
    //
    // //          setAbendReason(" ");
    //
    // //          setWsReturnMsg("UNEXPECTED DATA SCENARIO");
    //
    // //          SendPlainText(); /*To:SendPlainTextExit*/    }
    //
    // //      //  If we had an error setup error message that slipped through
    //
    // //      //  Display and return
    //
    // //      if (getInputError())    {
    //
    // //          setCcardErrorMsg(getWsReturnMsg());
    //
    // //          SendMap(); /*To:SendMapExit*/    } }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       COMMON-RETURN.
    // //           MOVE WS-RETURN-MSG     TO CCARD-ERROR-MSG
    // //
    // //           MOVE  CARDDEMO-COMMAREA    TO WS-COMMAREA
    // //           MOVE  WS-THIS-PROGCOMMAREA TO
    // //                  WS-COMMAREA(LENGTH OF CARDDEMO-COMMAREA + 1:
    // //                               LENGTH OF WS-THIS-PROGCOMMAREA )
    // //
    // //           EXEC CICS RETURN
    // //                TRANSID (LIT-THISTRANID)
    // //                COMMAREA (WS-COMMAREA)
    // //                LENGTH(LENGTH OF WS-COMMAREA)
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void CommonReturn(){
    //
    // //      setCcardErrorMsg(getWsReturnMsg());
    //
    // //      setWsCommarea(getCarddemoCommarea());
    //
    // //          wsThisProgcommarea.Length())(getWsThisProgcommarea());        EXEC CICS RETURN                                                                     TRANSID (LIT-THISTRANID)                                                        COMMAREA (WS-COMMAREA)                                                          LENGTH(LENGTH OF WS-COMMAREA)                                              END-EXEC    */   }
    //
    // //      setWsCommarea.Substring(carddemoCommarea.Length() + 1,
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       0000-MAIN-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void MainExit(){}
    //
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void MainExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1000-SEND-MAP.
    // //           PERFORM 1100-SCREEN-INIT
    // //              THRU 1100-SCREEN-INIT-EXIT
    // //           PERFORM 1200-SETUP-SCREEN-VARS
    // //              THRU 1200-SETUP-SCREEN-VARS-EXIT
    // //           PERFORM 1300-SETUP-SCREEN-ATTRS
    // //              THRU 1300-SETUP-SCREEN-ATTRS-EXIT
    // //           PERFORM 1400-SEND-SCREEN
    // //              THRU 1400-SEND-SCREEN-EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendMap(){
    //
    // //      ScreenInit(); /*To:ScreenInitExit*/
    //
    // //      SetupScreenVars(); /*To:SetupScreenVarsExit*/
    //
    // //      SetupScreenAttrs(); /*To:SetupScreenAttrsExit*/
    //
    // //  }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1000-SEND-MAP-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendMapExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1100-SCREEN-INIT.
    // //           MOVE LOW-VALUES             TO CACTVWAO
    // //
    // //           MOVE FUNCTION CURRENT-DATE  TO WS-CURDATE-DATA
    // //
    // //           MOVE CCDA-TITLE01           TO TITLE01O OF CACTVWAO
    // //           MOVE CCDA-TITLE02           TO TITLE02O OF CACTVWAO
    // //           MOVE LIT-THISTRANID         TO TRNNAMEO OF CACTVWAO
    // //           MOVE LIT-THISPGM            TO PGMNAMEO OF CACTVWAO
    // //
    // //           MOVE FUNCTION CURRENT-DATE  TO WS-CURDATE-DATA
    // //
    // //           MOVE WS-CURDATE-MONTH       TO WS-CURDATE-MM
    // //           MOVE WS-CURDATE-DAY         TO WS-CURDATE-DD
    // //           MOVE WS-CURDATE-YEAR(3:2)   TO WS-CURDATE-YY
    // //
    // //           MOVE WS-CURDATE-MM-DD-YY    TO CURDATEO OF CACTVWAO
    // //
    // //           MOVE WS-CURTIME-HOURS       TO WS-CURTIME-HH
    // //           MOVE WS-CURTIME-MINUTE      TO WS-CURTIME-MM
    // //           MOVE WS-CURTIME-SECOND      TO WS-CURTIME-SS
    // //
    // //           MOVE WS-CURTIME-HH-MM-SS    TO CURTIMEO OF CACTVWAO
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ScreenInit(){
    //
    // //      setCactvwao(null);
    //
    // //      setWsCurdateData(CURRENT-DATE( ));
    //
    // //      getCactvwao().setTitle01o(getCcdaTitle01());
    //
    // //      getCactvwao().setTitle02o(getCcdaTitle02());
    //
    // //      getCactvwao().setTrnnameo(getLitThistranid());
    //
    // //      getCactvwao().setPgmnameo(getLitThispgm());
    //
    // //      setWsCurdateData(CURRENT-DATE( ));
    //
    // //      setWsCurdateMm(getWsCurdateMonth());
    //
    // //      setWsCurdateDd(getWsCurdateDay());
    //
    // //      setWsCurdateYy(getWsCurdateYear().Substring(3, 2));
    //
    // //      getCactvwao().setCurdateo(getWsCurdateMmDdYy());
    //
    // //      setWsCurtimeHh(getWsCurtimeHours());
    //
    // //      setWsCurtimeMm(getWsCurtimeMinute());
    //
    // //      setWsCurtimeSs(getWsCurtimeSecond());}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1100-SCREEN-INIT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ScreenInitExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1200-SETUP-SCREEN-VARS.
    // //      *    INITIALIZE SEARCH CRITERIA
    // //           IF EIBCALEN = 0
    // //              SET  WS-PROMPT-FOR-INPUT TO TRUE
    // //           ELSE
    // //              IF FLG-ACCTFILTER-BLANK
    // //                 MOVE LOW-VALUES   TO ACCTSIDO OF CACTVWAO
    // //              ELSE
    // //                 MOVE CC-ACCT-ID   TO ACCTSIDO OF CACTVWAO
    // //              END-IF
    // //
    // //              IF FOUND-ACCT-IN-MASTER
    // //              OR FOUND-CUST-IN-MASTER
    // //                 MOVE ACCT-ACTIVE-STATUS  TO ACSTTUSO OF CACTVWAO
    // //
    // //                 MOVE ACCT-CURR-BAL       TO ACURBALO OF CACTVWAO
    // //
    // //                 MOVE ACCT-CREDIT-LIMIT   TO ACRDLIMO OF CACTVWAO
    // //
    // //                 MOVE ACCT-CASH-CREDIT-LIMIT
    // //                                          TO ACSHLIMO OF CACTVWAO
    // //
    // //                 MOVE ACCT-CURR-CYC-CREDIT
    // //                                          TO ACRCYCRO OF CACTVWAO
    // //
    // //                 MOVE ACCT-CURR-CYC-DEBIT TO ACRCYDBO OF CACTVWAO
    // //
    // //                 MOVE ACCT-OPEN-DATE      TO ADTOPENO OF CACTVWAO
    // //                 MOVE ACCT-EXPIRAION-DATE TO AEXPDTO  OF CACTVWAO
    // //                 MOVE ACCT-REISSUE-DATE   TO AREISDTO OF CACTVWAO
    // //                 MOVE ACCT-GROUP-ID       TO AADDGRPO OF CACTVWAO
    // //              END-IF
    // //
    // //              IF FOUND-CUST-IN-MASTER
    // //                MOVE CUST-ID              TO ACSTNUMO OF CACTVWAO
    // //      *         MOVE CUST-SSN             TO ACSTSSNO OF CACTVWAO
    // //                STRING
    // //                    CUST-SSN(1:3)
    // //                    '-'
    // //                    CUST-SSN(4:2)
    // //                    '-'
    // //                    CUST-SSN(6:4)
    // //                    DELIMITED BY SIZE
    // //                    INTO ACSTSSNO OF CACTVWAO
    // //                END-STRING
    // //                MOVE CUST-FICO-CREDIT-SCORE
    // //                                          TO ACSTFCOO OF CACTVWAO
    // //                MOVE CUST-DOB-YYYY-MM-DD  TO ACSTDOBO OF CACTVWAO
    // //                MOVE CUST-FIRST-NAME      TO ACSFNAMO OF CACTVWAO
    // //                MOVE CUST-MIDDLE-NAME     TO ACSMNAMO OF CACTVWAO
    // //                MOVE CUST-LAST-NAME       TO ACSLNAMO OF CACTVWAO
    // //                MOVE CUST-ADDR-LINE-1     TO ACSADL1O OF CACTVWAO
    // //                MOVE CUST-ADDR-LINE-2     TO ACSADL2O OF CACTVWAO
    // //                MOVE CUST-ADDR-LINE-3     TO ACSCITYO OF CACTVWAO
    // //                MOVE CUST-ADDR-STATE-CD   TO ACSSTTEO OF CACTVWAO
    // //                MOVE CUST-ADDR-ZIP        TO ACSZIPCO OF CACTVWAO
    // //                MOVE CUST-ADDR-COUNTRY-CD TO ACSCTRYO OF CACTVWAO
    // //                MOVE CUST-PHONE-NUM-1     TO ACSPHN1O OF CACTVWAO
    // //                MOVE CUST-PHONE-NUM-2     TO ACSPHN2O OF CACTVWAO
    // //                MOVE CUST-GOVT-ISSUED-ID  TO ACSGOVTO OF CACTVWAO
    // //                MOVE CUST-EFT-ACCOUNT-ID  TO ACSEFTCO OF CACTVWAO
    // //                MOVE CUST-PRI-CARD-HOLDER-IND
    // //                                          TO ACSPFLGO OF CACTVWAO
    // //              END-IF
    // //
    // //            END-IF
    // //
    // //      *    SETUP MESSAGE
    // //           IF WS-NO-INFO-MESSAGE
    // //             SET WS-PROMPT-FOR-INPUT TO TRUE
    // //           END-IF
    // //
    // //           MOVE WS-RETURN-MSG          TO ERRMSGO OF CACTVWAO
    // //
    // //           MOVE WS-INFO-MSG            TO INFOMSGO OF CACTVWAO
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SetupScreenVars()
    //
    // //  //     INITIALIZE SEARCH CRITERIA                                           {
    //
    // //      if (getEibcalen().equals(0))    {
    //
    // //          wsPromptForInput = = true;    }
    //
    // //      else    {
    //
    // //          if (getFlgAcctfilterBlank())        {
    //
    // //              getCactvwao().setAcctsido(null);        }
    //
    // //          else        {
    //
    // //              getCactvwao().setAcctsido(getCcAcctId());        }
    //
    // //          if (getFoundAcctInMaster()
    //
    // //              || getFoundCustInMaster())        {
    //
    // //              getCactvwao().setAcsttuso(getAcctActiveStatus());
    //
    // //              getCactvwao().setAcurbalo(getAcctCurrBal());
    //
    // //              getCactvwao().setAcrdlimo(getAcctCreditLimit());
    //
    // //              getCactvwao().setAcshlimo(getAcctCashCreditLimit());
    //
    // //              getCactvwao().setAcrcycro(getAcctCurrCycCredit());
    //
    // //              getCactvwao().setAcrcydbo(getAcctCurrCycDebit());
    //
    // //              getCactvwao().setAdtopeno(getAcctOpenDate());
    //
    // //              getCactvwao().setAexpdto(getAcctExpiraionDate());
    //
    // //              getCactvwao().setAreisdto(getAcctReissueDate());
    //
    // //              getCactvwao().setAaddgrpo(getAcctGroupId());        }
    //
    // //          if (getFoundCustInMaster())        {
    //
    // //              getCactvwao().setAcstnumo(getCustId());
    //
    // //              //          MOVE CUST-SSN             TO ACSTSSNO OF CACTVWAO
    //
    // //              getCactvwao().setAcstssno(getCustSsn().Substring(1,
    //
    // //                  3).equals(getCustSsn().Substring(4, 2)) + "-" + getCustSsn().Substring(6,                4));
    //
    // //              getCactvwao().setAcstfcoo(getCustFicoCreditScore());
    //
    // //              getCactvwao().setAcstdobo(getCustDobYyyyMmDd());
    //
    // //              getCactvwao().setAcsfnamo(getCustFirstName());
    //
    // //              getCactvwao().setAcsmnamo(getCustMiddleName());
    //
    // //              getCactvwao().setAcslnamo(getCustLastName());
    //
    // //              getCactvwao().setAcsadl1o(getCustAddrLine1());
    //
    // //              getCactvwao().setAcsadl2o(getCustAddrLine2());
    //
    // //              getCactvwao().setAcscityo(getCustAddrLine3());
    //
    // //              getCactvwao().setAcsstteo(getCustAddrStateCd());
    //
    // //              getCactvwao().setAcszipco(getCustAddrZip());
    //
    // //              getCactvwao().setAcsctryo(getCustAddrCountryCd());
    //
    // //              getCactvwao().setAcsphn1o(getCustPhoneNum1());
    //
    // //              getCactvwao().setAcsphn2o(getCustPhoneNum2());
    //
    // //              getCactvwao().setAcsgovto(getCustGovtIssuedId());
    //
    // //              getCactvwao().setAcseftco(getCustEftAccountId());
    //
    // //              getCactvwao().setAcspflgo(getCustPriCardHolderInd());        }    }
    //
    // //      //     SETUP MESSAGE
    //
    // //      if (getWsNoInfoMessage())    {
    //
    // //          wsPromptForInput = = true;    }
    //
    // //      getCactvwao().setErrmsgo(getWsReturnMsg());}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1200-SETUP-SCREEN-VARS-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SetupScreenVarsExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1300-SETUP-SCREEN-ATTRS.
    // //      *    PROTECT OR UNPROTECT BASED ON CONTEXT
    // //           MOVE DFHBMFSE               TO ACCTSIDA OF CACTVWAI
    // //
    // //      *    POSITION CURSOR
    // //           EVALUATE TRUE
    // //              WHEN FLG-ACCTFILTER-NOT-OK
    // //              WHEN FLG-ACCTFILTER-BLANK
    // //                   MOVE -1             TO ACCTSIDL OF CACTVWAI
    // //              WHEN OTHER
    // //                   MOVE -1             TO ACCTSIDL OF CACTVWAI
    // //           END-EVALUATE
    // //
    // //      *    SETUP COLOR
    // //           MOVE DFHDFCOL               TO ACCTSIDC OF CACTVWAO
    // //
    // //           IF FLG-ACCTFILTER-NOT-OK
    // //              MOVE DFHRED              TO ACCTSIDC OF CACTVWAO
    // //           END-IF
    // //
    // //           IF  FLG-ACCTFILTER-BLANK
    // //           AND CDEMO-PGM-REENTER
    // //               MOVE '*'                TO ACCTSIDO OF CACTVWAO
    // //               MOVE DFHRED             TO ACCTSIDC OF CACTVWAO
    // //           END-IF
    // //
    // //           IF  WS-NO-INFO-MESSAGE
    // //               MOVE DFHBMDAR           TO INFOMSGC OF CACTVWAO
    // //           ELSE
    // //               MOVE DFHNEUTR           TO INFOMSGC OF CACTVWAO
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SetupScreenAttrs()
    //
    // //  //     PROTECT OR UNPROTECT BASED ON CONTEXT                                {
    //
    // //      getCactvwai().setAcctsida(getDfhbmfse());
    //
    // //      //     POSITION CURSOR
    //
    // //      if (getFlgAcctfilterNotOk())    {            }
    //
    // //      else if (getFlgAcctfilterBlank())    {
    //
    // //          getCactvwai().setAcctsidl(-1);    }
    //
    // //      else if (default:)    {
    //
    // //          getCactvwai().setAcctsidl(-1);    }
    //
    // //      //     SETUP COLOR
    //
    // //      getCactvwao().setAcctsidc(getDfhdfcol());
    //
    // //      if (getFlgAcctfilterNotOk())    {
    //
    // //          getCactvwao().setAcctsidc(getDfhred());    }
    //
    // //      if (getFlgAcctfilterBlank()
    //
    // //          && getCdemoPgmReenter())    {
    //
    // //          getCactvwao().setAcctsido("*");
    //
    // //          getCactvwao().setAcctsidc(getDfhred());    }
    //
    // //      if (getWsNoInfoMessage())    {
    //
    // //          getCactvwao().setInfomsgc(getDfhbmdar());    }
    //
    // //      else    {    } }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1300-SETUP-SCREEN-ATTRS-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SetupScreenAttrsExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1400-SEND-SCREEN.
    // //
    // //           MOVE LIT-THISMAPSET         TO CCARD-NEXT-MAPSET
    // //           MOVE LIT-THISMAP            TO CCARD-NEXT-MAP
    // //           SET  CDEMO-PGM-REENTER TO TRUE
    // //
    // //           EXEC CICS SEND MAP(CCARD-NEXT-MAP)
    // //                          MAPSET(CCARD-NEXT-MAPSET)
    // //                          FROM(CACTVWAO)
    // //                          CURSOR
    // //                          ERASE
    // //                          FREEKB
    // //                          RESP(WS-RESP-CD)
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendScreen(){
    //
    // //      setCcardNextMapset(getLitThismapset());
    //
    // //      setCcardNextMap(getLitThismap());
    //
    // //      cdemoPgmReenter = = true;        EXEC CICS SEND MAP(CCARD-NEXT-MAP)                                                             MAPSET(CCARD-NEXT-MAPSET)                                                       FROM(CACTVWAO)                                                                  CURSOR                                                                          ERASE                                                                           FREEKB                                                                          RESP(WS-RESP-CD)                                                 END-EXEC    */   }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       1400-SEND-SCREEN-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendScreenExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2000-PROCESS-INPUTS.
    // //           PERFORM 2100-RECEIVE-MAP
    // //              THRU 2100-RECEIVE-MAP-EXIT
    // //           PERFORM 2200-EDIT-MAP-INPUTS
    // //              THRU 2200-EDIT-MAP-INPUTS-EXIT
    // //           MOVE WS-RETURN-MSG  TO CCARD-ERROR-MSG
    // //           MOVE LIT-THISPGM    TO CCARD-NEXT-PROG
    // //           MOVE LIT-THISMAPSET TO CCARD-NEXT-MAPSET
    // //           MOVE LIT-THISMAP    TO CCARD-NEXT-MAP
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ProcessInputs(){
    //
    // //      ReceiveMap(); /*To:ReceiveMapExit*/
    //
    // //      EditMapInputs(); /*To:EditMapInputsExit*/
    //
    // //      setCcardErrorMsg(getWsReturnMsg());
    //
    // //      setCcardNextProg(getLitThispgm());
    //
    // //      setCcardNextMapset(getLitThismapset());}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2000-PROCESS-INPUTS-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ProcessInputsExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2100-RECEIVE-MAP.
    // //           EXEC CICS RECEIVE MAP(LIT-THISMAP)
    // //                     MAPSET(LIT-THISMAPSET)
    // //                     INTO(CACTVWAI)
    // //                     RESP(WS-RESP-CD)
    // //                     RESP2(WS-REAS-CD)
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ReceiveMap(){        EXEC CICS RECEIVE MAP(LIT-THISMAP)                                                        MAPSET(LIT-THISMAPSET)                                                          INTO(CACTVWAI)                                                                  RESP(WS-RESP-CD)                                                                RESP2(WS-REAS-CD)                                                     END-EXEC    */   }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2100-RECEIVE-MAP-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ReceiveMapExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2200-EDIT-MAP-INPUTS.
    // //
    // //           SET INPUT-OK                  TO TRUE
    // //           SET FLG-ACCTFILTER-ISVALID    TO TRUE
    // //
    // //      *    REPLACE * WITH LOW-VALUES
    // //           IF  ACCTSIDI OF CACTVWAI = '*'
    // //           OR  ACCTSIDI OF CACTVWAI = SPACES
    // //               MOVE LOW-VALUES           TO  CC-ACCT-ID
    // //           ELSE
    // //               MOVE ACCTSIDI OF CACTVWAI TO  CC-ACCT-ID
    // //           END-IF
    // //
    // //      *    INDIVIDUAL FIELD EDITS
    // //           PERFORM 2210-EDIT-ACCOUNT
    // //              THRU 2210-EDIT-ACCOUNT-EXIT
    // //
    // //      *    CROSS FIELD EDITS
    // //           IF  FLG-ACCTFILTER-BLANK
    // //               SET NO-SEARCH-CRITERIA-RECEIVED TO TRUE
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void EditMapInputs(){
    //
    // //      inputOk = = true;
    //
    // //      flgAcctfilterIsvalid = = true;
    //
    // //      //     REPLACE * WITH LOW-VALUES
    //
    // //      if ("*".equals(getCactvwai().getAcctsidi())
    //
    // //          || getCactvwai().getAcctsidi().equals(" "))    {
    //
    // //          setCcAcctId(null);    }
    //
    // //      else    {
    //
    // //          setCcAcctId(getCactvwai().getAcctsidi());    }
    //
    // //      //     INDIVIDUAL FIELD EDITS
    //
    // //      EditAccount(); /*To:EditAccountExit*/
    //
    // //      //     CROSS FIELD EDITS
    //
    // //      if (getFlgAcctfilterBlank())    {    } }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2200-EDIT-MAP-INPUTS-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void EditMapInputsExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2210-EDIT-ACCOUNT.
    // //           SET FLG-ACCTFILTER-NOT-OK TO TRUE
    // //
    // //      *    Not supplied
    // //           IF CC-ACCT-ID   EQUAL LOW-VALUES
    // //           OR CC-ACCT-ID   EQUAL SPACES
    // //              SET INPUT-ERROR           TO TRUE
    // //              SET FLG-ACCTFILTER-BLANK  TO TRUE
    // //              IF WS-RETURN-MSG-OFF
    // //                 SET WS-PROMPT-FOR-ACCT TO TRUE
    // //              END-IF
    // //              MOVE ZEROES       TO CDEMO-ACCT-ID
    // //              GO TO  2210-EDIT-ACCOUNT-EXIT
    // //           END-IF
    // //      *
    // //      *    Not numeric
    // //      *    Not 11 characters
    // //           IF CC-ACCT-ID  IS NOT NUMERIC
    // //           OR CC-ACCT-ID  EQUAL ZEROES
    // //              SET INPUT-ERROR TO TRUE
    // //              SET FLG-ACCTFILTER-NOT-OK TO TRUE
    // //              IF WS-RETURN-MSG-OFF
    // //                MOVE
    // //              'Account Filter must  be a non-zero 11 digit number'      00
    // //                              TO WS-RETURN-MSG
    // //              END-IF
    // //              MOVE ZERO       TO CDEMO-ACCT-ID
    // //              GO TO 2210-EDIT-ACCOUNT-EXIT
    // //           ELSE
    // //              MOVE CC-ACCT-ID TO CDEMO-ACCT-ID
    // //              SET FLG-ACCTFILTER-ISVALID TO TRUE
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void EditAccount(){
    //
    // //      flgAcctfilterNotOk = = true;
    //
    // //      //     Not supplied
    //
    // //      if (getCcAcctId().equals(null)
    //
    // //          || getCcAcctId().equals(" "))    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterBlank = = true;
    //
    // //          if (getWsReturnMsgOff())        {
    //
    // //              wsPromptForAcct = = true;        }
    //
    // //          setCdemoAcctId(0);
    //
    // //          /* TODO Untranslated GoTo found. " Go TO EditAccountExit" Ln:1609 */    }
    //
    // //      //
    //
    // //      //     Not numeric
    //
    // //      //     Not 11 characters
    //
    // //      if (!Int32.TryParse(getCcAcctId(), out testInt)
    //
    // //          || getCcAcctId().equals(0))    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterNotOk = = true;
    //
    // //          if (getWsReturnMsgOff())        {
    //
    // //              setWsReturnMsg("Account Filter must  be a non-zero 11 digit number");        }
    //
    // //          setCdemoAcctId(0);
    //
    // //          /* TODO Untranslated GoTo found. " Go TO EditAccountExit" Ln:1624 */    }
    //
    // //      else    {
    //
    // //          setCdemoAcctId(getCcAcctId());    } }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       2210-EDIT-ACCOUNT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void EditAccountExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9000-READ-ACCT.
    // //
    // //           SET  WS-NO-INFO-MESSAGE  TO TRUE
    // //
    // //           MOVE CDEMO-ACCT-ID TO WS-CARD-RID-ACCT-ID
    // //
    // //           PERFORM 9200-GETCARDXREF-BYACCT
    // //              THRU 9200-GETCARDXREF-BYACCT-EXIT
    // //
    // //      *    IF DID-NOT-FIND-ACCT-IN-CARDXREF
    // //           IF FLG-ACCTFILTER-NOT-OK
    // //              GO TO 9000-READ-ACCT-EXIT
    // //           END-IF
    // //
    // //           PERFORM 9300-GETACCTDATA-BYACCT
    // //              THRU 9300-GETACCTDATA-BYACCT-EXIT
    // //
    // //           IF DID-NOT-FIND-ACCT-IN-ACCTDAT
    // //              GO TO 9000-READ-ACCT-EXIT
    // //           END-IF
    // //
    // //           MOVE CDEMO-CUST-ID TO WS-CARD-RID-CUST-ID
    // //
    // //           PERFORM 9400-GETCUSTDATA-BYCUST
    // //              THRU 9400-GETCUSTDATA-BYCUST-EXIT
    // //
    // //           IF DID-NOT-FIND-CUST-IN-CUSTDAT
    // //              GO TO 9000-READ-ACCT-EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ReadAcct(){
    //
    // //      wsNoInfoMessage = = true;
    //
    // //      setWsCardRidAcctId(getCdemoAcctId());
    //
    // //      GetcardxrefByacct(); /*To:GetcardxrefByacctExit*/
    //
    // //      //     IF DID-NOT-FIND-ACCT-IN-CARDXREF
    //
    // //      if (getFlgAcctfilterNotOk())    {
    //
    // //          /* TODO Untranslated GoTo found. " Go TO ReadAcctExit" Ln:1646 */    }
    //
    // //      GetacctdataByacct(); /*To:GetacctdataByacctExit*/
    //
    // //      if (getDidNotFindAcctInAcctdat())    {
    //
    // //          /* TODO Untranslated GoTo found. " Go TO ReadAcctExit" Ln:1653 */    }
    //
    // //      setWsCardRidCustId(getCdemoCustId());
    //
    // //      GetcustdataBycust(); /*To:GetcustdataBycustExit*/
    //
    // //      if (getDidNotFindCustInCustdat())    {    } }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9000-READ-ACCT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void ReadAcctExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9200-GETCARDXREF-BYACCT.
    // //
    // //      *    Read the Card file. Access via alternate index ACCTID
    // //      *
    // //           EXEC CICS READ
    // //                DATASET   (LIT-CARDXREFNAME-ACCT-PATH)
    // //                RIDFLD    (WS-CARD-RID-ACCT-ID-X)
    // //                KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)
    // //                INTO      (CARD-XREF-RECORD)
    // //                LENGTH    (LENGTH OF CARD-XREF-RECORD)
    // //                RESP      (WS-RESP-CD)
    // //                RESP2     (WS-REAS-CD)
    // //           END-EXEC
    // //
    // //           EVALUATE WS-RESP-CD
    // //               WHEN DFHRESP(NORMAL)
    // //                  MOVE XREF-CUST-ID               TO CDEMO-CUST-ID
    // //                  MOVE XREF-CARD-NUM              TO CDEMO-CARD-NUM
    // //               WHEN DFHRESP(NOTFND)
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-ACCTFILTER-NOT-OK       TO TRUE
    // //                  IF WS-RETURN-MSG-OFF
    // //                    MOVE WS-RESP-CD               TO ERROR-RESP
    // //                    MOVE WS-REAS-CD               TO ERROR-RESP2
    // //                    STRING
    // //                    'Account:'
    // //                     WS-CARD-RID-ACCT-ID-X
    // //                    ' not found in'
    // //                    ' Cross ref file.  Resp:'
    // //                    ERROR-RESP
    // //                    ' Reas:'
    // //                    ERROR-RESP2
    // //                    DELIMITED BY SIZE
    // //                    INTO WS-RETURN-MSG
    // //                    END-STRING
    // //                  END-IF
    // //               WHEN OTHER
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-ACCTFILTER-NOT-OK                TO TRUE
    // //                  MOVE 'READ'                     TO ERROR-OPNAME
    // //                  MOVE LIT-CARDXREFNAME-ACCT-PATH TO ERROR-FILE
    // //                  MOVE WS-RESP-CD                 TO ERROR-RESP
    // //                  MOVE WS-REAS-CD                 TO ERROR-RESP2
    // //                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG
    // //      *                                              WS-LONG-MSG
    // //      *          PERFORM SEND-LONG-TEXT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetcardxrefByacct()
    //
    // //  //     Read the Card file. Access via alternate index ACCTID
    //
    // //  //                                                                          {
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1675        EXEC CICS READ                                                                       DATASET   (LIT-CARDXREFNAME-ACCT-PATH)                                          RIDFLD    (WS-CARD-RID-ACCT-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                                     INTO      (CARD-XREF-RECORD)                                                    LENGTH    (LENGTH OF CARD-XREF-RECORD)                                          RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */
    //
    // //      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          setCdemoCustId(getXrefCustId());
    //
    // //          setCdemoCardNum(getXrefCardNum());    }
    //
    // //      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterNotOk = = true;
    //
    // //          if (getWsReturnMsgOff())        {
    //
    // //              setErrorResp(getWsRespCd());
    //
    // //              setErrorResp2(getWsReasCd());
    //
    // //              setWsReturnMsg("Account:" + " Cross ref file.  Resp:".equals(getWsCardRidAcctIdX())
    //
    // //                  + getErrorResp().equals(getErrorResp2()));        }    }
    //
    // //      else if (default:)    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterNotOk = = true;
    //
    // //          setErrorOpname("READ");
    //
    // //          setErrorFile(getLitCardxrefnameAcctPath());
    //
    // //          setErrorResp(getWsRespCd());
    //
    // //          setErrorResp2(getWsReasCd());
    //
    // //          setWsReturnMsg(getWsFileErrorMessage());    }
    //
    // //      //                                               WS-LONG-MSG                         }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9200-GETCARDXREF-BYACCT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetcardxrefByacctExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9300-GETACCTDATA-BYACCT.
    // //
    // //           EXEC CICS READ
    // //                DATASET   (LIT-ACCTFILENAME)
    // //                RIDFLD    (WS-CARD-RID-ACCT-ID-X)
    // //                KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)
    // //                INTO      (ACCOUNT-RECORD)
    // //                LENGTH    (LENGTH OF ACCOUNT-RECORD)
    // //                RESP      (WS-RESP-CD)
    // //                RESP2     (WS-REAS-CD)
    // //           END-EXEC
    // //
    // //           EVALUATE WS-RESP-CD
    // //               WHEN DFHRESP(NORMAL)
    // //                  SET FOUND-ACCT-IN-MASTER        TO TRUE
    // //               WHEN DFHRESP(NOTFND)
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-ACCTFILTER-NOT-OK       TO TRUE
    // //      *           SET DID-NOT-FIND-ACCT-IN-ACCTDAT TO TRUE
    // //                  IF WS-RETURN-MSG-OFF
    // //                    MOVE WS-RESP-CD               TO ERROR-RESP
    // //                    MOVE WS-REAS-CD               TO ERROR-RESP2
    // //                    STRING
    // //                    'Account:'
    // //                     WS-CARD-RID-ACCT-ID-X
    // //                    ' not found in'
    // //                    ' Acct Master file.Resp:'
    // //                    ERROR-RESP
    // //                    ' Reas:'
    // //                    ERROR-RESP2
    // //                    DELIMITED BY SIZE
    // //                    INTO WS-RETURN-MSG
    // //                    END-STRING
    // //                  END-IF
    // //      *
    // //               WHEN OTHER
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-ACCTFILTER-NOT-OK                TO TRUE
    // //                  MOVE 'READ'                     TO ERROR-OPNAME
    // //                  MOVE LIT-ACCTFILENAME           TO ERROR-FILE
    // //                  MOVE WS-RESP-CD                 TO ERROR-RESP
    // //                  MOVE WS-REAS-CD                 TO ERROR-RESP2
    // //                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG
    // //      *                                              WS-LONG-MSG
    // //      *           PERFORM SEND-LONG-TEXT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetacctdataByacct(){
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1724        EXEC CICS READ                                                                       DATASET   (LIT-ACCTFILENAME)                                                    RIDFLD    (WS-CARD-RID-ACCT-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-ACCT-ID-X)                                     INTO      (ACCOUNT-RECORD)                                                      LENGTH    (LENGTH OF ACCOUNT-RECORD)                                            RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */
    //
    // //      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          foundAcctInMaster = = true;    }
    //
    // //      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterNotOk = = true;
    //
    // //          //            SET DID-NOT-FIND-ACCT-IN-ACCTDAT TO TRUE
    //
    // //          if (getWsReturnMsgOff())        {
    //
    // //              setErrorResp(getWsRespCd());
    //
    // //              setErrorResp2(getWsReasCd());
    //
    // //              setWsReturnMsg("Account:" + " Acct Master file.Resp:".equals(getWsCardRidAcctIdX())
    //
    // //                  + getErrorResp().equals(getErrorResp2()));        }    }
    //
    // //      //
    //
    // //      else if (default:)    {
    //
    // //          inputError = = true;
    //
    // //          flgAcctfilterNotOk = = true;
    //
    // //          setErrorOpname("READ");
    //
    // //          setErrorFile(getLitAcctfilename());
    //
    // //          setErrorResp(getWsRespCd());
    //
    // //          setErrorResp2(getWsReasCd());
    //
    // //          setWsReturnMsg(getWsFileErrorMessage());    }
    //
    // //      //                                               WS-LONG-MSG                         }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9300-GETACCTDATA-BYACCT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetacctdataByacctExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9400-GETCUSTDATA-BYCUST.
    // //           EXEC CICS READ
    // //                DATASET   (LIT-CUSTFILENAME)
    // //                RIDFLD    (WS-CARD-RID-CUST-ID-X)
    // //                KEYLENGTH (LENGTH OF WS-CARD-RID-CUST-ID-X)
    // //                INTO      (CUSTOMER-RECORD)
    // //                LENGTH    (LENGTH OF CUSTOMER-RECORD)
    // //                RESP      (WS-RESP-CD)
    // //                RESP2     (WS-REAS-CD)
    // //           END-EXEC
    // //
    // //           EVALUATE WS-RESP-CD
    // //               WHEN DFHRESP(NORMAL)
    // //                  SET FOUND-CUST-IN-MASTER        TO TRUE
    // //               WHEN DFHRESP(NOTFND)
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-CUSTFILTER-NOT-OK       TO TRUE
    // //      *           SET DID-NOT-FIND-CUST-IN-CUSTDAT TO TRUE
    // //                  MOVE WS-RESP-CD               TO ERROR-RESP
    // //                  MOVE WS-REAS-CD               TO ERROR-RESP2
    // //                  IF WS-RETURN-MSG-OFF
    // //                    STRING
    // //                    'CustId:'
    // //                     WS-CARD-RID-CUST-ID-X
    // //                    ' not found'
    // //                    ' in customer master.Resp: '
    // //                    ERROR-RESP
    // //                    ' REAS:'
    // //                    ERROR-RESP2
    // //                    DELIMITED BY SIZE
    // //                    INTO WS-RETURN-MSG
    // //                    END-STRING
    // //                  END-IF
    // //               WHEN OTHER
    // //                  SET INPUT-ERROR                 TO TRUE
    // //                  SET FLG-CUSTFILTER-NOT-OK                TO TRUE
    // //                  MOVE 'READ'                     TO ERROR-OPNAME
    // //                  MOVE LIT-CUSTFILENAME           TO ERROR-FILE
    // //                  MOVE WS-RESP-CD                 TO ERROR-RESP
    // //                  MOVE WS-REAS-CD                 TO ERROR-RESP2
    // //                  MOVE WS-FILE-ERROR-MESSAGE      TO WS-RETURN-MSG
    // //      *                                              WS-LONG-MSG
    // //      *           PERFORM SEND-LONG-TEXT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetcustdataBycust(){
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1774        EXEC CICS READ                                                                       DATASET   (LIT-CUSTFILENAME)                                                    RIDFLD    (WS-CARD-RID-CUST-ID-X)                                               KEYLENGTH (LENGTH OF WS-CARD-RID-CUST-ID-X)                                     INTO      (CUSTOMER-RECORD)                                                     LENGTH    (LENGTH OF CUSTOMER-RECORD)                                           RESP      (WS-RESP-CD)                                                          RESP2     (WS-REAS-CD)                                                     END-EXEC    */
    //
    // //      if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          foundCustInMaster = = true;    }
    //
    // //      else if (getWsRespCd() == /* TODO: CICS variables not handled. */)    {
    //
    // //          inputError = = true;
    //
    // //          flgCustfilterNotOk = = true;
    //
    // //          //            SET DID-NOT-FIND-CUST-IN-CUSTDAT TO TRUE
    //
    // //          setErrorResp(getWsRespCd());
    //
    // //          setErrorResp2(getWsReasCd());
    //
    // //          if (getWsReturnMsgOff())        {
    //
    // //              setWsReturnMsg("CustId:" + " in customer master.Resp:".equals(getWsCardRidCustIdX())
    //
    // //                  + getErrorResp().equals(getErrorResp2()));        }    }
    //
    // //      else if (default:)    {
    //
    // //          inputError = = true;
    //
    // //          flgCustfilterNotOk = = true;
    //
    // //          setErrorOpname("READ");
    //
    // //          setErrorFile(getLitCustfilename());
    //
    // //          setErrorResp(getWsRespCd());
    //
    // //          setErrorResp2(getWsReasCd());
    //
    // //          setWsReturnMsg(getWsFileErrorMessage());    }
    //
    // //      //                                               WS-LONG-MSG                         }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       9400-GETCUSTDATA-BYCUST-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void GetcustdataBycustExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       SEND-PLAIN-TEXT.
    // //           EXEC CICS SEND TEXT
    // //                     FROM(WS-RETURN-MSG)
    // //                     LENGTH(LENGTH OF WS-RETURN-MSG)
    // //                     ERASE
    // //                     FREEKB
    // //           END-EXEC
    // //
    // //           EXEC CICS RETURN
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendPlainText(){
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1826        EXEC CICS SEND TEXT                                                                       FROM(WS-RETURN-MSG)                                                             LENGTH(LENGTH OF WS-RETURN-MSG)                                                 ERASE                                                                           FREEKB                                                                END-EXEC    */          EXEC CICS RETURN                                                                END-EXEC    */   }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       SEND-PLAIN-TEXT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendPlainTextExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       SEND-LONG-TEXT.
    // //           EXEC CICS SEND TEXT
    // //                     FROM(WS-LONG-MSG)
    // //                     LENGTH(LENGTH OF WS-LONG-MSG)
    // //                     ERASE
    // //                     FREEKB
    // //           END-EXEC
    // //
    // //           EXEC CICS RETURN
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendLongText(){
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1845        EXEC CICS SEND TEXT                                                                       FROM(WS-LONG-MSG)                                                               LENGTH(LENGTH OF WS-LONG-MSG)                                                   ERASE                                                                           FREEKB                                                                END-EXEC    */          EXEC CICS RETURN                                                                END-EXEC    */   }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       SEND-LONG-TEXT-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void SendLongTextExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       YYYY-STORE-PFKEY.
    // //      *****************************************************************
    // //      * Map AID to PFKey in COMMON Area
    // //      *****************************************************************
    // //           EVALUATE TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHENTER
    // //               SET CCARD-AID-ENTER TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHCLEAR
    // //               SET CCARD-AID-CLEAR TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPA1
    // //               SET CCARD-AID-PA1  TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPA2
    // //               SET CCARD-AID-PA2  TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF1
    // //               SET CCARD-AID-PFK01 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF2
    // //               SET CCARD-AID-PFK02 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF3
    // //               SET CCARD-AID-PFK03 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF4
    // //               SET CCARD-AID-PFK04 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF5
    // //               SET CCARD-AID-PFK05 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF6
    // //               SET CCARD-AID-PFK06 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF7
    // //               SET CCARD-AID-PFK07 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF8
    // //               SET CCARD-AID-PFK08 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF9
    // //               SET CCARD-AID-PFK09 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF10
    // //               SET CCARD-AID-PFK10 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF11
    // //               SET CCARD-AID-PFK11 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF12
    // //               SET CCARD-AID-PFK12 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF13
    // //               SET CCARD-AID-PFK01 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF14
    // //               SET CCARD-AID-PFK02 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF15
    // //               SET CCARD-AID-PFK03 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF16
    // //               SET CCARD-AID-PFK04 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF17
    // //               SET CCARD-AID-PFK05 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF18
    // //               SET CCARD-AID-PFK06 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF19
    // //               SET CCARD-AID-PFK07 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF20
    // //               SET CCARD-AID-PFK08 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF21
    // //               SET CCARD-AID-PFK09 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF22
    // //               SET CCARD-AID-PFK10 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF23
    // //               SET CCARD-AID-PFK11 TO TRUE
    // //             WHEN EIBAID IS EQUAL TO DFHPF24
    // //               SET CCARD-AID-PFK12 TO TRUE
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void YyyyStorePfkey()
    //
    // //  // ****************************************************************
    //
    // //  //  Map AID to PFKey in COMMON Area
    //
    // //  // ****************************************************************         {
    //
    // //      if (getEibaid().equals(getDfhenter()))    {
    //
    // //          ccardAidEnter = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhclear()))    {
    //
    // //          ccardAidClear = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpa1()))    {
    //
    // //          ccardAidPa1 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpa2()))    {
    //
    // //          ccardAidPa2 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf1()))    {
    //
    // //          ccardAidPfk01 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf2()))    {
    //
    // //          ccardAidPfk02 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf3()))    {
    //
    // //          ccardAidPfk03 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf4()))    {
    //
    // //          ccardAidPfk04 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf5()))    {
    //
    // //          ccardAidPfk05 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf6()))    {
    //
    // //          ccardAidPfk06 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf7()))    {
    //
    // //          ccardAidPfk07 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf8()))    {
    //
    // //          ccardAidPfk08 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf9()))    {
    //
    // //          ccardAidPfk09 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf10()))    {
    //
    // //          ccardAidPfk10 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf11()))    {
    //
    // //          ccardAidPfk11 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf12()))    {
    //
    // //          ccardAidPfk12 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf13()))    {
    //
    // //          ccardAidPfk01 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf14()))    {
    //
    // //          ccardAidPfk02 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf15()))    {
    //
    // //          ccardAidPfk03 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf16()))    {
    //
    // //          ccardAidPfk04 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf17()))    {
    //
    // //          ccardAidPfk05 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf18()))    {
    //
    // //          ccardAidPfk06 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf19()))    {
    //
    // //          ccardAidPfk07 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf20()))    {
    //
    // //          ccardAidPfk08 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf21()))    {
    //
    // //          ccardAidPfk09 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf22()))    {
    //
    // //          ccardAidPfk10 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf23()))    {
    //
    // //          ccardAidPfk11 = = true;    }
    //
    // //      else if (getEibaid().equals(getDfhpf24()))    {    }     }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       YYYY-STORE-PFKEY-EXIT.
    // //           EXIT
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void YyyyStorePfkeyExit(){}
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    // //////////////////////////////////////////////
    // // Commented legacy code for referenece :  Start
    // //       ABEND-ROUTINE.
    // //
    // //           IF ABEND-MSG EQUAL LOW-VALUES
    // //              MOVE 'UNEXPECTED ABEND OCCURRED.' TO ABEND-MSG
    // //           END-IF
    // //
    // //           MOVE LIT-THISPGM       TO ABEND-CULPRIT
    // //
    // //           EXEC CICS SEND
    // //                            FROM (ABEND-DATA)
    // //                            LENGTH(LENGTH OF ABEND-DATA)
    // //                            NOHANDLE
    // //           END-EXEC
    // //
    // //           EXEC CICS HANDLE ABEND
    // //                CANCEL
    // //           END-EXEC
    // //
    // //           EXEC CICS ABEND
    // //                ABCODE('9999')
    // //           END-EXEC
    // // Commented Legacy code for referenece:  End
    // //////////////////////////////////////////////
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  Start
    // //  /// <summary>/// Description for Method/// </summary>/// <param name="param">param 1</param>/// <returns></returns>public void AbendRoutine(){
    //
    // //      if (getAbendMsg().equals(null))    {
    //
    // //          setAbendMsg("UNEXPECTED ABEND OCCURRED.");    }
    //
    // //      setAbendCulprit(getLitThispgm());
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1959        EXEC CICS SEND                                                                                   FROM (ABEND-DATA)                                                               LENGTH(LENGTH OF ABEND-DATA)                                                    NOHANDLE                                                       END-EXEC    */
    //
    // //      /* TODO Exec CICS statement not yet translated.  Ln:1965        EXEC CICS HANDLE ABEND                                                               CANCEL                                                                     END-EXEC    */          EXEC CICS ABEND                                                                      ABCODE('9999')                                                             END-EXEC    */   }
    //
    // //////////////////////////////////////////////
    // // Commented translated  :  end
    //
    //
    //

    // Transplied Code from legacy- End

}
