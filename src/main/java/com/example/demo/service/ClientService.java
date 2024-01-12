package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientService implements ClientRepository {
		
		@Autowired
		private ClientRepository clientRepository;

		@Override
		public List<Client> findAll() {
			// TODO Auto-generated method stub
			return clientRepository.findAll();
		}

		@Override
		public List<Client> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return clientRepository.findAll(sort);
		}

		@Override
		public List<Client> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public <S extends Client> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteInBatch(Iterable<Client> entities) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Client getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Page<Client> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> S save(S entity) {
			// TODO Auto-generated method stub
			return clientRepository.save(entity);
		}

		@Override
		public Optional<Client> findById(Long id) {
			// TODO Auto-generated method stub
			return clientRepository.findById(id);
		}

		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void deleteById(Long id) {
			
			clientRepository.deleteById(id);
		}

		@Override
		public void delete(Client entity) {
			
			clientRepository.delete(entity);
		}

		@Override
		public void deleteAll(Iterable<? extends Client> entities) {
			// TODO Auto-generated method stub
			clientRepository.deleteAll(entities);
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			clientRepository.deleteAll();
		}

		@Override
		public <S extends Client> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <S extends Client> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public <S extends Client> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}
}
