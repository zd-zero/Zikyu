package zero.zd.zquestionnaire;


import java.util.ArrayList;

import zero.zd.zquestionnaire.model.QnA;
import zero.zd.zquestionnaire.model.QnaSubject;

/**
 * Helper class for retrieving QnA for different topics.
 * for future feature: choosing diff topics instead of 1 topic
 * Note: temporary implementation
 */
class QnaHelper {

    // TODO: add more QnA, import & export file
    static QnaSubject getBasicQnA() {
        ArrayList<QnA> qnaList = new ArrayList<>();
        qnaList.add(new QnA("ABC", "ABC"));
        qnaList.add(new QnA("DEF", "DEF"));
        qnaList.add(new QnA("GHI", "GHI"));
        qnaList.add(new QnA("JKL", "JKL"));
        qnaList.add(new QnA("MNO", "MNO"));
        qnaList.add(new QnA("PQR", "PQR"));
        qnaList.add(new QnA("STU", "STU"));
        qnaList.add(new QnA("VWX", "VWX"));
        qnaList.add(new QnA("YZA", "YZA"));
        qnaList.add(new QnA("BCD", "BCD"));

        return new QnaSubject("Debug", qnaList);
    }

    static QnaSubject getBasicQnaSmall() {
        ArrayList<QnA> qnaList = new ArrayList<>();
        qnaList.add(new QnA("ABC", "ABC"));
        qnaList.add(new QnA("DEF", "DEF"));
        qnaList.add(new QnA("GHI", "GHI"));
        qnaList.add(new QnA("JKL", "JKL"));
        qnaList.add(new QnA("MNO", "MNO"));

        return new QnaSubject("Debug Basic QnA Small", qnaList);
    }

}