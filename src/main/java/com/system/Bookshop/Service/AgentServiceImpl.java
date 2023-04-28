package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Agent;
import com.system.Bookshop.Repository.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService{

    @Autowired
    private AgentRepo agentRepo;

    @Override
    public Agent saveAgent(Agent agent) {
        return agentRepo.save(agent);
    }

    @Override
    public List<Agent> getAllAgents() {
        return agentRepo.findAll();
    }

    @Override
    public Agent getAgentById(Integer id) {
        return  agentRepo.findById(id).get();
    }

    @Override
    public void deleteAgent(Integer id) {
        agentRepo.deleteById(id);
    }
}
