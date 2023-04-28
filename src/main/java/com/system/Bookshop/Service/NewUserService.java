package com.system.Bookshop.Service;

import com.system.Bookshop.DTO.LoginDto;
import com.system.Bookshop.DTO.NewUserDto;
import com.system.Bookshop.Payload.Response.LoginMessage;
import com.system.Bookshop.Response.LoginResponse;

public interface NewUserService {

    String addNewUser(NewUserDto newUserDto);

    LoginResponse loginNewUser(LoginDto loginDto);

}
