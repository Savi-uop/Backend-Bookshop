package com.system.Bookshop.Controller;


import com.system.Bookshop.Entity.Agent;
import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "api/v1/agent")
@CrossOrigin("http://localhost:3000")
public class AgentController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/getAgents")
    public List<Agent> getAllAgent(){
        return agentService.getAllAgents();
    }

    @PostMapping("/saveAgent")
    public String saveAgent(@RequestBody Agent agent){
        agentService.saveAgent(agent);
        return "new agent is added" ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agent> getAgent(@PathVariable Integer id){
        try{
            Agent agent = agentService.getAgentById(id);
            return new ResponseEntity<Agent>(agent, HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<Agent>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("update/{id}")
    public ResponseEntity<Agent> updateAgent(@RequestBody Agent agent,@PathVariable Integer id){
        try{
            Agent existingAgent = agentService.getAgentById(id);
            agentService.saveAgent(agent);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<Agent>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleting/{id}")
    public String deleteAgent(@PathVariable Integer id){
        agentService.deleteAgent(id);
        return "Deleted agent with ID :" + id + " successfully!";
    }


}
