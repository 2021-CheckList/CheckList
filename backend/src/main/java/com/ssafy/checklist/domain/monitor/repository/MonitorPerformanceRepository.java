package com.ssafy.checklist.domain.monitor.repository;

import com.ssafy.checklist.domain.monitor.entity.MonitorPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorPerformanceRepository extends JpaRepository<MonitorPerformance, Long> {
}
