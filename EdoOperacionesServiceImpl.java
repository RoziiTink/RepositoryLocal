package com.praxis.cofi.core.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.praxis.cofi.core.data.dto.EdoOperacionesDto;
import com.praxis.cofi.core.data.repository.EstadosDeOperacionPorDireccionesRepositoryWrapper;
import com.praxis.cofi.core.util.ConstantCOFI;
import com.praxis.cofi.core.util.TiempoUtil;

/**
 * Servicio Implementado de EdoOperacionesService (Grid Principal)
 * 
 * @author GAGL
 *
 */
@Service
@Transactional
public class EdoOperacionesServiceImpl implements EdoOperacionesService {
}
