INSERT INTO orders (user_id, total_amount, status) VALUES
    (1, 99.99, 'PENDING'),
    (2, 149.99, 'COMPLETED')
ON DUPLICATE KEY UPDATE
    total_amount = VALUES(total_amount),
    status = VALUES(status);
