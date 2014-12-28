package org.netpod.utility.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.server.Authentication.User;
import org.netpod.utility.auth.Authority;
import org.netpod.utility.auth.RestrictedTo;
import org.netpod.utility.domain.CreateUserRequest;

import com.yammer.metrics.annotation.Timed;

public class ProcessResource {
	
	@POST
	@Timed
	@Path("/user")
	public Response create(
	  @RestrictedTo({Authority.ROLE_ADMIN})
	  User adminUser,
	  CreateUserRequest createUserRequest) {
		System.out.println("create(): " + createUserRequest);
		return Response.ok().build();
	}
}
