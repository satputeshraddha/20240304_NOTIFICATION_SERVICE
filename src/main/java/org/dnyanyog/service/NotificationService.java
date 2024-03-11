package org.dnyanyog.service;

import org.dnyanyog.dto.NotificationRequest;
import org.dnyanyog.dto.NotificationResponse;

public interface NotificationService
{
	public NotificationResponse sendNotification(NotificationRequest request);

}
