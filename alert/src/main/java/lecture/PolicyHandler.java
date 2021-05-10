package lecture;

import lecture.config.kafka.KafkaProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString) {

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassCanceled_SendSms(@Payload ClassCanceled classCanceled) {

        if (classCanceled.isMe()) {
            System.out.println("##### listener SendSms : " + classCanceled.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassModified_SendSms(@Payload ClassModified classModified) {

        if (classModified.isMe()) {
            System.out.println("##### listener SendSms : " + classModified.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverClassRegistered_SendSms(@Payload ClassRegistered classRegistered) {

        if (classRegistered.isMe()) {
            System.out.println("##### listener SendSms : " + classRegistered.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseDeleted_SendSms(@Payload CourseDeleted courseDeleted) {

        if (courseDeleted.isMe()) {
            System.out.println("##### listener SendSms : " + courseDeleted.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseModified_SendSms(@Payload CourseModified courseModified) {

        if (courseModified.isMe()) {
            System.out.println("##### listener SendSms : " + courseModified.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCourseRegistered_SendSms(@Payload CourseRegistered courseRegistered) {

        if (courseRegistered.isMe()) {
            System.out.println("##### listener SendSms : " + courseRegistered.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentApproved_SendSms(@Payload PaymentApproved paymentApproved) {

        if (paymentApproved.isMe()) {
            System.out.println("##### listener SendSms : " + paymentApproved.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentCanceled_SendSms(@Payload PaymentCanceled paymentCanceled) {

        if (paymentCanceled.isMe()) {
            System.out.println("##### listener SendSms : " + paymentCanceled.toJson());
            System.out.println();
            System.out.println();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTextbookDeliveried_SendSms(@Payload TextbookDeliveried textbookDeliveried) {

        if (textbookDeliveried.isMe()) {
            System.out.println("##### listener SendSms : " + textbookDeliveried.toJson());
            System.out.println();
            System.out.println();
        }
    }
}
