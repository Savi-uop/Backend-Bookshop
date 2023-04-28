package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Agent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentService {


    public Agent saveAgent(Agent agent);

    public List<Agent> getAllAgents();

    public abstract Agent getAgentById(Integer id);

    public void deleteAgent(Integer id);
}
