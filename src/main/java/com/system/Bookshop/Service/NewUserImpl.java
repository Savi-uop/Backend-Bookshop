package com.system.Bookshop.Service;

import com.system.Bookshop.DTO.LoginDto;
import com.system.Bookshop.DTO.NewUserDto;
import com.system.Bookshop.Entity.NewUser;
import com.system.Bookshop.Payload.Response.LoginMessage;
import com.system.Bookshop.Repository.NewUserRepo;
import com.system.Bookshop.Response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewUserImpl implements NewUserService{

    @Autowired
    private NewUserRepo newUserRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addNewUser(NewUserDto newUserDto) {

        NewUser newUser = new NewUser(

                newUserDto.getUserid(),
                newUserDto.getUfname(),
                newUserDto.getUlname(),
                newUserDto.getEmail(),

                this.passwordEncoder.encode(newUserDto.getPassword())
        );

       newUserRepo.save(newUser);

        return newUser.getUfname();
    }

    NewUserDto newUserDto;

    @Override
    public LoginResponse loginNewUser(LoginDto loginDto) {
        String msg = "";
        NewUser newUser1 = newUserRepo.findByEmail(loginDto.getEmail());
        if (newUser1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = newUser1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<NewUser> newUser = newUserRepo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (newUser.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }


    }


}
