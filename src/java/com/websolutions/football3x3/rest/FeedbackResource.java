package com.websolutions.football3x3.rest;

import com.websolutions.football3x3.dao.feedback.FeedbackDao;
import com.websolutions.football3x3.entity.Feedback;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Владислав on 09.06.2015.
 */
@RestController
@Path("feedbacks")
public class FeedbackResource {

    @Inject
    private FeedbackDao feedbackDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Feedback> getAllFeedbacks() {
        return feedbackDao.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Feedback getFeedbackById(@PathParam("id") Integer id) {
        return feedbackDao.find(id);
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Feedback createFeedback(Feedback feedback) {
        feedback.setDate(new Timestamp(new java.util.Date().getTime()));
        return feedbackDao.save(feedback);
    }

    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Feedback updateFeedback(@PathParam("id") Integer id,Feedback feedback) {
        return feedbackDao.save(feedback);
    }


}